package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {

    @Select("select * from book")
    List<Book> getAllBooK();

}
