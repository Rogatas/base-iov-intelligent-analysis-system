package com.lgd.model.mapper;

import com.lgd.model.pojo.VehicleMaxCount;
import com.lgd.model.pojo.VehicleMaxCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface VehicleMaxCountMapper {
    int countByExample(VehicleMaxCountExample example);

    int deleteByExample(VehicleMaxCountExample example);

    @Delete({
        "delete from vehicle_max_count",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into vehicle_max_count (inner_id, max_speed, ",
        "max_mileage, max_engine_speed, ",
        "max_engine_tem, max_engine_load)",
        "values (#{innerId,jdbcType=VARCHAR}, #{maxSpeed,jdbcType=INTEGER}, ",
        "#{maxMileage,jdbcType=INTEGER}, #{maxEngineSpeed,jdbcType=INTEGER}, ",
        "#{maxEngineTem,jdbcType=INTEGER}, #{maxEngineLoad,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VehicleMaxCount record);

    int insertSelective(VehicleMaxCount record);

    List<VehicleMaxCount> selectByExample(VehicleMaxCountExample example);

    @Select({
        "select",
        "id, inner_id, max_speed, max_mileage, max_engine_speed, max_engine_tem, max_engine_load",
        "from vehicle_max_count",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    VehicleMaxCount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleMaxCount record, @Param("example") VehicleMaxCountExample example);

    int updateByExample(@Param("record") VehicleMaxCount record, @Param("example") VehicleMaxCountExample example);

    int updateByPrimaryKeySelective(VehicleMaxCount record);

    @Update({
        "update vehicle_max_count",
        "set inner_id = #{innerId,jdbcType=VARCHAR},",
          "max_speed = #{maxSpeed,jdbcType=INTEGER},",
          "max_mileage = #{maxMileage,jdbcType=INTEGER},",
          "max_engine_speed = #{maxEngineSpeed,jdbcType=INTEGER},",
          "max_engine_tem = #{maxEngineTem,jdbcType=INTEGER},",
          "max_engine_load = #{maxEngineLoad,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VehicleMaxCount record);
}