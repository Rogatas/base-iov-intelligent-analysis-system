package com.lgd.model.mapper;

import com.lgd.model.pojo.UserLoginInformation;
import com.lgd.model.pojo.UserLoginInformationExample;
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

public interface UserLoginInformationMapper {
    @SelectProvider(type=UserLoginInformationSqlProvider.class, method="countByExample")
    int countByExample(UserLoginInformationExample example);

    @DeleteProvider(type=UserLoginInformationSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserLoginInformationExample example);

    @Delete({
        "delete from user_login_information",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user_login_information (username, password)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UserLoginInformation record);

    @InsertProvider(type=UserLoginInformationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(UserLoginInformation record);

    @SelectProvider(type=UserLoginInformationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    List<UserLoginInformation> selectByExample(UserLoginInformationExample example);

    @Select({
        "select",
        "id, username, password",
        "from user_login_information",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    UserLoginInformation selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserLoginInformationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserLoginInformation record, @Param("example") UserLoginInformationExample example);

    @UpdateProvider(type=UserLoginInformationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserLoginInformation record, @Param("example") UserLoginInformationExample example);

    @UpdateProvider(type=UserLoginInformationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserLoginInformation record);

    @Update({
        "update user_login_information",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserLoginInformation record);
}