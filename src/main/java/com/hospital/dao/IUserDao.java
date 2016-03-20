package com.hospital.dao;

import com.hospital.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by morland on 2016/3/18.
 */
@Repository
public interface IUserDao {
    @Select("select * from user where username=#{username} limit 1 ")
    User getByUserName(String username);

    @Select("select * from user where username=#{username} AND password=#{password} limit 1 ")
    User getUser(@Param("username")String username,@Param("password") String password);

}
