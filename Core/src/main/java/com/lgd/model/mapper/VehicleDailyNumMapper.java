package com.lgd.model.mapper;

import com.lgd.model.pojo.VehicleDailyNum;
import com.lgd.model.pojo.VehicleDailyNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface VehicleDailyNumMapper {
    @SelectProvider(type=VehicleDailyNumSqlProvider.class, method="countByExample")
    int countByExample(VehicleDailyNumExample example);

    @DeleteProvider(type=VehicleDailyNumSqlProvider.class, method="deleteByExample")
    int deleteByExample(VehicleDailyNumExample example);

    @Delete({
        "delete from vehicle_daily_num",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into vehicle_daily_num (vehicle_id, storage_time, ",
        "vehicle_id_num)",
        "values (#{vehicleId,jdbcType=VARCHAR}, #{storageTime,jdbcType=DATE}, ",
        "#{vehicleIdNum,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VehicleDailyNum record);

    @InsertProvider(type=VehicleDailyNumSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(VehicleDailyNum record);

    @SelectProvider(type=VehicleDailyNumSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="vehicle_id", property="vehicleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_time", property="storageTime", jdbcType=JdbcType.DATE),
        @Result(column="vehicle_id_num", property="vehicleIdNum", jdbcType=JdbcType.INTEGER)
    })
    List<VehicleDailyNum> selectByExample(VehicleDailyNumExample example);

    @Select({
        "select",
        "id, vehicle_id, storage_time, vehicle_id_num",
        "from vehicle_daily_num",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="vehicle_id", property="vehicleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_time", property="storageTime", jdbcType=JdbcType.DATE),
        @Result(column="vehicle_id_num", property="vehicleIdNum", jdbcType=JdbcType.INTEGER)
    })
    VehicleDailyNum selectByPrimaryKey(Integer id);

    @UpdateProvider(type=VehicleDailyNumSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") VehicleDailyNum record, @Param("example") VehicleDailyNumExample example);

    @UpdateProvider(type=VehicleDailyNumSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") VehicleDailyNum record, @Param("example") VehicleDailyNumExample example);

    @UpdateProvider(type=VehicleDailyNumSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(VehicleDailyNum record);

    @Update({
        "update vehicle_daily_num",
        "set vehicle_id = #{vehicleId,jdbcType=VARCHAR},",
          "storage_time = #{storageTime,jdbcType=DATE},",
          "vehicle_id_num = #{vehicleIdNum,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VehicleDailyNum record);
}