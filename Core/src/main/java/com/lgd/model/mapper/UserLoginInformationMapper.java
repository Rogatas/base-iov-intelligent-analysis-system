package com.lgd.model.mapper;

import com.lgd.model.pojo.UserLoginInformation;
import com.lgd.model.pojo.UserLoginInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserLoginInformationMapper {
    int countByExample(UserLoginInformationExample example);

    int deleteByExample(UserLoginInformationExample example);

    @Delete({
        "delete from user_login_information",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_login_information (username, password, ",
        "email)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UserLoginInformation record);

    int insertSelective(UserLoginInformation record);

    List<UserLoginInformation> selectByExample(UserLoginInformationExample example);

    @Select({
        "select",
        "id, username, password, email",
        "from user_login_information",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    UserLoginInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLoginInformation record, @Param("example") UserLoginInformationExample example);

    int updateByExample(@Param("record") UserLoginInformation record, @Param("example") UserLoginInformationExample example);

    int updateByPrimaryKeySelective(UserLoginInformation record);

    @Update({
        "update user_login_information",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserLoginInformation record);
}