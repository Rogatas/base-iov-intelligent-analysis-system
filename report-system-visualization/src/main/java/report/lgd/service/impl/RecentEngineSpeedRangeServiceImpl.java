package report.lgd.service.impl;

import com.lgd.model.pojo.RecentEngineSpeedRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.dao.RecentEngineSpeedRangeDao;
import report.lgd.service.RecentEngineSpeedRangeService;

import java.util.List;

/**
 * Created by liguodong on 2016/4/17.
 */

@Service("recentEngineSpeedRangeService")
public class RecentEngineSpeedRangeServiceImpl implements RecentEngineSpeedRangeService {


    @Autowired
    RecentEngineSpeedRangeDao recentEngineSpeedRangeDao;

    public void setRecentEngineSpeedRangeDao(RecentEngineSpeedRangeDao recentEngineSpeedRangeDao) {
        this.recentEngineSpeedRangeDao = recentEngineSpeedRangeDao;
    }

    @Override
    public List<RecentEngineSpeedRange> query() {
        return recentEngineSpeedRangeDao.query();
    }
}
