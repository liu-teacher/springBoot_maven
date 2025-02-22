package com.example.springboot_maven.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private int id;
    private String gender;
    private String score;
}
