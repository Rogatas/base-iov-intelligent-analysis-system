package report.lgd.mapper.hive.operation;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: MajorModuleStatHiveMapper</p>
 * <p>Description: </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2017/2/28 10:24
 */

public interface MajorModuleStatHiveMapper {

    List<Map<String,Object>> queryMajorModuleNewUser();

}
