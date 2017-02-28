package report.lgd.service.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.mapper.hive.operation.MajorModuleStatHiveMapper;
import report.lgd.mapper.mysql.operation.MajorModuleStatMysqlMapper;

/**
 * <p>Title: MajorModuleStatService</p>
 * <p>Description: </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2017/2/28 10:23
 */
@Service
public class MajorModuleStatService {

    @Autowired
    MajorModuleStatHiveMapper majorModuleStatHiveMapper;

    @Autowired
    MajorModuleStatMysqlMapper majorModuleStatMysqlMapper;


    public void stat(){
        majorModuleStatHiveMapper.queryMajorModuleNewUser();
    }


}
