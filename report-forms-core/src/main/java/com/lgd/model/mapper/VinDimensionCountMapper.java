package com.lgd.model.mapper;

import com.lgd.model.pojo.VinDimensionCount;
import com.lgd.model.pojo.VinDimensionCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface VinDimensionCountMapper {
    int countByExample(VinDimensionCountExample example);

    int deleteByExample(VinDimensionCountExample example);

    @Delete({
        "delete from vin_dimension_count",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into vin_dimension_count (province, pv, ",
        "uv_country, uv_oem, ",
        "uv_year)",
        "values (#{province,jdbcType=VARCHAR}, #{pv,jdbcType=INTEGER}, ",
        "#{uvCountry,jdbcType=INTEGER}, #{uvOem,jdbcType=INTEGER}, ",
        "#{uvYear,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(VinDimensionCount record);

    int insertSelective(VinDimensionCount record);

    List<VinDimensionCount> selectByExample(VinDimensionCountExample example);

    @Select({
        "select",
        "id, province, pv, uv_country, uv_oem, uv_year",
        "from vin_dimension_count",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    VinDimensionCount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VinDimensionCount record, @Param("example") VinDimensionCountExample example);

    int updateByExample(@Param("record") VinDimensionCount record, @Param("example") VinDimensionCountExample example);

    int updateByPrimaryKeySelective(VinDimensionCount record);

    @Update({
        "update vin_dimension_count",
        "set province = #{province,jdbcType=VARCHAR},",
          "pv = #{pv,jdbcType=INTEGER},",
          "uv_country = #{uvCountry,jdbcType=INTEGER},",
          "uv_oem = #{uvOem,jdbcType=INTEGER},",
          "uv_year = #{uvYear,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(VinDimensionCount record);
}