package com.example.springboot_maven.controller;

import com.example.springboot_maven.pojo.Book;
import com.example.springboot_maven.pojo.Student;
import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/getAllBooK")
    private List<Book> getAllBooK(){
        return bookService.getAllBooK();
    }





    @RequestMapping("/studentList")
    public List<Student> list(){
        //1. 生成一个员工集合
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1,"1", "99.0");
        Student s2 = new Student(2,"1", "88.0");
        Student s3 = new Student(3,"2", "77.5");
        Student s4 = new Student(4,"2", "55.0");


        studentList.add(s1);        studentList.add(s2);
        studentList.add(s3);        studentList.add(s4);
        //2. 对数据进行转换处理 - gender, score
        for(int i=0;i<studentList.size();i++){
            Student student = studentList.get(i);
            //处理 gender 1: 男, 2: 女
            String gender = student.getGender();
            if("1".equals(gender)){
                student.setGender("男");
            }else if("2".equals (gender)){
                student.setGender("女");
            }
            //处理成绩score - 大于等于85：优秀 小于85：良好
            Double score = Double.valueOf(student.getScore());
            if(85<=score){
                student.setScore("优秀");
            }else if(85>score){
                student.setScore("良好");
            }
        }
        //3. 返回数据
        return studentList;
    }

}
