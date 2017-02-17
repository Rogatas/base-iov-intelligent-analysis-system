package com.lgd.model.mapper;

import com.lgd.model.pojo.VehicleEngineTemRange;
import com.lgd.model.pojo.VehicleEngineTemRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface VehicleEngineTemRangeMapper {
    int countByExample(VehicleEngineTemRangeExample example);

    int deleteByExample(VehicleEngineTemRangeExample example);

    @Delete({
        "delete from vehicle_engine_tem_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into vehicle_engine_tem_range (vehicle_engine_tem, num)",
        "values (#{vehicleEngineTem,jdbcType=VARCHAR}, #{num,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VehicleEngineTemRange record);

    int insertSelective(VehicleEngineTemRange record);

    List<VehicleEngineTemRange> selectByExample(VehicleEngineTemRangeExample example);

    @Select({
        "select",
        "id, vehicle_engine_tem, num",
        "from vehicle_engine_tem_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    VehicleEngineTemRange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleEngineTemRange record, @Param("example") VehicleEngineTemRangeExample example);

    int updateByExample(@Param("record") VehicleEngineTemRange record, @Param("example") VehicleEngineTemRangeExample example);

    int updateByPrimaryKeySelective(VehicleEngineTemRange record);

    @Update({
        "update vehicle_engine_tem_range",
        "set vehicle_engine_tem = #{vehicleEngineTem,jdbcType=VARCHAR},",
          "num = #{num,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VehicleEngineTemRange record);
}