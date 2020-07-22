package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.*;


public interface UserMapper {
    //    @Select("select * from user where id = ${id}")
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "name", column = "name"),
//    })
//    User get(@Param("id") Integer id);
    User get(Integer id);

//    @Select("select * from user")
//    public List<User> list();
}
