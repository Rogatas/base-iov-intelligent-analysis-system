package report.lgd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.bvo.VinDimensionCountBvo;
import report.lgd.dao.VinDimensionCountDao;
import report.lgd.service.VinDimensionCountService;

import java.util.List;

/**
 * Created by liguodong on 2016/4/3.
 */
@Service("vinDimensionCountService")
public class VinDimensionCountServiceImpl implements VinDimensionCountService {

    @Autowired
    VinDimensionCountDao vinDimensionCountDao;

    public void setVinDimensionCountDao(VinDimensionCountDao vinDimensionCountDao) {
        this.vinDimensionCountDao = vinDimensionCountDao;
    }

    @Override
    public List<VinDimensionCountBvo> query() {
        return vinDimensionCountDao.query();
    }
}
