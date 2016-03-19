package com.lgd.model.mapper;

import com.lgd.model.pojo.VehicleDailyNum;
import com.lgd.model.pojo.VehicleDailyNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleDailyNumMapper {
    int countByExample(VehicleDailyNumExample example);

    int deleteByExample(VehicleDailyNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleDailyNum record);

    int insertSelective(VehicleDailyNum record);

    List<VehicleDailyNum> selectByExample(VehicleDailyNumExample example);

    VehicleDailyNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleDailyNum record, @Param("example") VehicleDailyNumExample example);

    int updateByExample(@Param("record") VehicleDailyNum record, @Param("example") VehicleDailyNumExample example);

    int updateByPrimaryKeySelective(VehicleDailyNum record);

    int updateByPrimaryKey(VehicleDailyNum record);
}