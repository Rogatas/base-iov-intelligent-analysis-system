package utils.encoding;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by liguodong on 2016/3/25.
 */
public class EncodingFilter implements Filter {

    /** 编码 */
    String encoding = null;

    /**
     * 初始化编码,从配置文件中获取编码的值
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding = filterConfig.getInitParameter("encoding");
    }

    /**
     * 执行过滤链,对请求和相应设置编码
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        if (encoding != null) {
            // 对请求进行编码设置
            request.setCharacterEncoding(encoding);
            response.setCharacterEncoding(encoding);
        }
        // 将处理权转交给下一个处理器
        filterChain.doFilter(request, response);
    }

    /** 销毁编码 */
    @Override
    public void destroy() {
        this.encoding = null;
    }
}
