package com.lgd.model.mapper;

import com.lgd.model.pojo.VehicleSpeedRange;
import com.lgd.model.pojo.VehicleSpeedRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface VehicleSpeedRangeMapper {
    int countByExample(VehicleSpeedRangeExample example);

    int deleteByExample(VehicleSpeedRangeExample example);

    @Delete({
        "delete from vehicle_speed_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into vehicle_speed_range (vehicle_speed, num)",
        "values (#{vehicleSpeed,jdbcType=VARCHAR}, #{num,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VehicleSpeedRange record);

    int insertSelective(VehicleSpeedRange record);

    List<VehicleSpeedRange> selectByExample(VehicleSpeedRangeExample example);

    @Select({
        "select",
        "id, vehicle_speed, num",
        "from vehicle_speed_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    VehicleSpeedRange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleSpeedRange record, @Param("example") VehicleSpeedRangeExample example);

    int updateByExample(@Param("record") VehicleSpeedRange record, @Param("example") VehicleSpeedRangeExample example);

    int updateByPrimaryKeySelective(VehicleSpeedRange record);

    @Update({
        "update vehicle_speed_range",
        "set vehicle_speed = #{vehicleSpeed,jdbcType=VARCHAR},",
          "num = #{num,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VehicleSpeedRange record);
}