package com.example.springboot_maven.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
//@Component
public class Book {
    private int id;
    private String bookName;
    private Double bookPrice;
    public Book(){
        System.out.println("创建book bean");
    }


}


