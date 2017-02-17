package report.lgd.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.Properties;

/**
 * <p>Title: LoggingSqlInterceptor</p>
 * <p>Description: 输出SQL日志拦截处理器</p>
 *
 * @author liguodong
 * @version 1.0
 * @date 2017/2/17 15:22
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class})})
public class LoggingSqlInterceptor implements Interceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingSqlInterceptor.class);

    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        LOGGER.info("输出SQL日志拦截处理器：sql：{}", boundSql.getSql().replaceAll("[\\t\\n\\r]", "").replaceAll("\\s{2,}", " "));
        LOGGER.info("输出SQL日志拦截处理器：Parameters：{}", boundSql.getParameterObject());
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
    }

}
