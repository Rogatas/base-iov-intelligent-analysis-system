package com.lgd.model.mapper;

import com.lgd.model.pojo.VehicleEngineLoadRange;
import com.lgd.model.pojo.VehicleEngineLoadRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface VehicleEngineLoadRangeMapper {
    int countByExample(VehicleEngineLoadRangeExample example);

    int deleteByExample(VehicleEngineLoadRangeExample example);

    @Delete({
        "delete from vehicle_engine_load_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into vehicle_engine_load_range (vehicle_engine_load, num)",
        "values (#{vehicleEngineLoad,jdbcType=VARCHAR}, #{num,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VehicleEngineLoadRange record);

    int insertSelective(VehicleEngineLoadRange record);

    List<VehicleEngineLoadRange> selectByExample(VehicleEngineLoadRangeExample example);

    @Select({
        "select",
        "id, vehicle_engine_load, num",
        "from vehicle_engine_load_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    VehicleEngineLoadRange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleEngineLoadRange record, @Param("example") VehicleEngineLoadRangeExample example);

    int updateByExample(@Param("record") VehicleEngineLoadRange record, @Param("example") VehicleEngineLoadRangeExample example);

    int updateByPrimaryKeySelective(VehicleEngineLoadRange record);

    @Update({
        "update vehicle_engine_load_range",
        "set vehicle_engine_load = #{vehicleEngineLoad,jdbcType=VARCHAR},",
          "num = #{num,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VehicleEngineLoadRange record);
}