package com.lgd.model.mapper;

import com.lgd.model.pojo.VehicleEngineSpeedRange;
import com.lgd.model.pojo.VehicleEngineSpeedRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface VehicleEngineSpeedRangeMapper {
    int countByExample(VehicleEngineSpeedRangeExample example);

    int deleteByExample(VehicleEngineSpeedRangeExample example);

    @Delete({
        "delete from vehicle_engine_speed_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into vehicle_engine_speed_range (vehicle_engine_speed, num)",
        "values (#{vehicleEngineSpeed,jdbcType=VARCHAR}, #{num,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VehicleEngineSpeedRange record);

    int insertSelective(VehicleEngineSpeedRange record);

    List<VehicleEngineSpeedRange> selectByExample(VehicleEngineSpeedRangeExample example);

    @Select({
        "select",
        "id, vehicle_engine_speed, num",
        "from vehicle_engine_speed_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    VehicleEngineSpeedRange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleEngineSpeedRange record, @Param("example") VehicleEngineSpeedRangeExample example);

    int updateByExample(@Param("record") VehicleEngineSpeedRange record, @Param("example") VehicleEngineSpeedRangeExample example);

    int updateByPrimaryKeySelective(VehicleEngineSpeedRange record);

    @Update({
        "update vehicle_engine_speed_range",
        "set vehicle_engine_speed = #{vehicleEngineSpeed,jdbcType=VARCHAR},",
          "num = #{num,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VehicleEngineSpeedRange record);
}