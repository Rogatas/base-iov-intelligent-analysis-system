package report.lgd.dao;

import report.lgd.bvo.VinDimensionCountBvo;

import java.util.List;

/**
 * Vin码各维度统计
 *
 * Created by liguodong on 2016/4/3.
 */
public interface VinDimensionCountDao {

    public List<VinDimensionCountBvo> query();

}
