package com.example.springboot_maven.service.impl;

import com.example.springboot_maven.mapper.User01Dao;
import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.User01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User01ServiceImpl implements User01Service {


    @Autowired
    private User01Dao user01Dao;

    @Override
    public User getUserById(int id) {

//        User user = new User();
//        user.setId(id);
//        user.setUsername("zhangsan");
//        user.setPassword("1234567");
//
//        System.out.println(user.getId());
//        System.out.println(user.getUsername());
//
//        return user;
        User user = user01Dao.getUserById(id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return user01Dao.getAllUser();
    }

    @Override
    public int addUser(User user) {
        return user01Dao.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return user01Dao.updateUser(user);
    }

    @Override
    public int delete(int id) {
        return user01Dao.delete(id);
    }


}
