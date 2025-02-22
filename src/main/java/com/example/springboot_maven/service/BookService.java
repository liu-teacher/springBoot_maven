package com.example.springboot_maven.service;

import com.example.springboot_maven.mapper.BookDao;
import com.example.springboot_maven.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BookService{

    @Autowired
    private BookDao bookDao;


    public List<Book> getAllBooK(){
        return bookDao.getAllBooK();
    }
}
