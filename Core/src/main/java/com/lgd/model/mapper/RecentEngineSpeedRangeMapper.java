package com.lgd.model.mapper;

import com.lgd.model.pojo.RecentEngineSpeedRange;
import com.lgd.model.pojo.RecentEngineSpeedRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RecentEngineSpeedRangeMapper {
    int countByExample(RecentEngineSpeedRangeExample example);

    int deleteByExample(RecentEngineSpeedRangeExample example);

    @Delete({
        "delete from recent_engine_speed_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into recent_engine_speed_range (inner_id, max_speed, ",
        "min_speed)",
        "values (#{innerId,jdbcType=VARCHAR}, #{maxSpeed,jdbcType=INTEGER}, ",
        "#{minSpeed,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(RecentEngineSpeedRange record);

    int insertSelective(RecentEngineSpeedRange record);

    List<RecentEngineSpeedRange> selectByExample(RecentEngineSpeedRangeExample example);

    @Select({
        "select",
        "id, inner_id, max_speed, min_speed",
        "from recent_engine_speed_range",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    RecentEngineSpeedRange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecentEngineSpeedRange record, @Param("example") RecentEngineSpeedRangeExample example);

    int updateByExample(@Param("record") RecentEngineSpeedRange record, @Param("example") RecentEngineSpeedRangeExample example);

    int updateByPrimaryKeySelective(RecentEngineSpeedRange record);

    @Update({
        "update recent_engine_speed_range",
        "set inner_id = #{innerId,jdbcType=VARCHAR},",
          "max_speed = #{maxSpeed,jdbcType=INTEGER},",
          "min_speed = #{minSpeed,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RecentEngineSpeedRange record);
}