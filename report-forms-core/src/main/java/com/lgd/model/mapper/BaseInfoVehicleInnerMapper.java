package com.lgd.model.mapper;

import com.lgd.model.pojo.BaseInfoVehicleInner;
import com.lgd.model.pojo.BaseInfoVehicleInnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface BaseInfoVehicleInnerMapper {
    int countByExample(BaseInfoVehicleInnerExample example);

    int deleteByExample(BaseInfoVehicleInnerExample example);

    @Delete({
        "delete from base_info_vehicle_inner",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into base_info_vehicle_inner (inner_id, min_oil_wear, ",
        "average_oil_wear, max_oil_wear, ",
        "min_intake_tem, average_intake_tem, ",
        "max_intake_tem, min_air_flow, ",
        "average_air_flow, max_air_flow, ",
        "min_battery_voltage, average_battery_voltage, ",
        "max_battery_voltage, min_coolant_tem, ",
        "average_coolant_tem, max_coolant_tem)",
        "values (#{innerId,jdbcType=VARCHAR}, #{minOilWear,jdbcType=DOUBLE}, ",
        "#{averageOilWear,jdbcType=DOUBLE}, #{maxOilWear,jdbcType=DOUBLE}, ",
        "#{minIntakeTem,jdbcType=DOUBLE}, #{averageIntakeTem,jdbcType=DOUBLE}, ",
        "#{maxIntakeTem,jdbcType=DOUBLE}, #{minAirFlow,jdbcType=DOUBLE}, ",
        "#{averageAirFlow,jdbcType=DOUBLE}, #{maxAirFlow,jdbcType=DOUBLE}, ",
        "#{minBatteryVoltage,jdbcType=DOUBLE}, #{averageBatteryVoltage,jdbcType=DOUBLE}, ",
        "#{maxBatteryVoltage,jdbcType=DOUBLE}, #{minCoolantTem,jdbcType=DOUBLE}, ",
        "#{averageCoolantTem,jdbcType=DOUBLE}, #{maxCoolantTem,jdbcType=DOUBLE})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(BaseInfoVehicleInner record);

    int insertSelective(BaseInfoVehicleInner record);

    List<BaseInfoVehicleInner> selectByExample(BaseInfoVehicleInnerExample example);

    @Select({
        "select",
        "id, inner_id, min_oil_wear, average_oil_wear, max_oil_wear, min_intake_tem, ",
        "average_intake_tem, max_intake_tem, min_air_flow, average_air_flow, max_air_flow, ",
        "min_battery_voltage, average_battery_voltage, max_battery_voltage, min_coolant_tem, ",
        "average_coolant_tem, max_coolant_tem",
        "from base_info_vehicle_inner",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    BaseInfoVehicleInner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseInfoVehicleInner record, @Param("example") BaseInfoVehicleInnerExample example);

    int updateByExample(@Param("record") BaseInfoVehicleInner record, @Param("example") BaseInfoVehicleInnerExample example);

    int updateByPrimaryKeySelective(BaseInfoVehicleInner record);

    @Update({
        "update base_info_vehicle_inner",
        "set inner_id = #{innerId,jdbcType=VARCHAR},",
          "min_oil_wear = #{minOilWear,jdbcType=DOUBLE},",
          "average_oil_wear = #{averageOilWear,jdbcType=DOUBLE},",
          "max_oil_wear = #{maxOilWear,jdbcType=DOUBLE},",
          "min_intake_tem = #{minIntakeTem,jdbcType=DOUBLE},",
          "average_intake_tem = #{averageIntakeTem,jdbcType=DOUBLE},",
          "max_intake_tem = #{maxIntakeTem,jdbcType=DOUBLE},",
          "min_air_flow = #{minAirFlow,jdbcType=DOUBLE},",
          "average_air_flow = #{averageAirFlow,jdbcType=DOUBLE},",
          "max_air_flow = #{maxAirFlow,jdbcType=DOUBLE},",
          "min_battery_voltage = #{minBatteryVoltage,jdbcType=DOUBLE},",
          "average_battery_voltage = #{averageBatteryVoltage,jdbcType=DOUBLE},",
          "max_battery_voltage = #{maxBatteryVoltage,jdbcType=DOUBLE},",
          "min_coolant_tem = #{minCoolantTem,jdbcType=DOUBLE},",
          "average_coolant_tem = #{averageCoolantTem,jdbcType=DOUBLE},",
          "max_coolant_tem = #{maxCoolantTem,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BaseInfoVehicleInner record);
}