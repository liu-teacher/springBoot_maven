package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface User01Dao {

    @Select("select * from user where id = #{id}")
    User getUserById(int id);

    @Select("select * from user")
    List<User> getAllUser();

    @Insert("insert into user(id, username, password) values (#{id}, #{username}, #{password})")
//    @Insert("insert into user values (null, username = #{username}, password = #{password})")
    int addUser(User user);

    @Update("update user set username = #{username}, password = #{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int delete(int id);

}
