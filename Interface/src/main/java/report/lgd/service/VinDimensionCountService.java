package report.lgd.service;

import org.springframework.beans.factory.annotation.Autowired;
import report.lgd.bvo.VinDimensionCountBvo;
import report.lgd.dao.VinDimensionCountDao;

import java.util.List;

/**
 * Created by liguodong on 2016/4/3.
 */
public interface VinDimensionCountService {


    public List<VinDimensionCountBvo> query();


}
