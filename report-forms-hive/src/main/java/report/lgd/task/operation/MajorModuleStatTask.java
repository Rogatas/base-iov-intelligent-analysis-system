package report.lgd.task.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import report.lgd.service.operation.MajorModuleStatService;

/**
 * <p>Title: MajorModuleStatTask</p>
 * <p>Description: </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2017/2/28 10:19
 */
@Component
public class MajorModuleStatTask {

    @Autowired
    MajorModuleStatService majorModuleStatService;

}
