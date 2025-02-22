package com.example.springboot_maven.controller;
import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.pojo.User;
import com.example.springboot_maven.service.News01Service;
import com.example.springboot_maven.service.User01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/user01")
public class User01Controller {
    @Autowired//依赖注入
    private User01Service user01Service;

    @Autowired
    private News01Service news01Service;

    @RequestMapping("/getUserById")
    public User getUserById(int id){
        User user = user01Service.getUserById(id);
        return user;
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return user01Service.getAllUser();
    }
    @RequestMapping("/addUser")
    public int addUser(@RequestBody User user){
        return user01Service.addUser(user);
    }

    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return user01Service.updateUser(user);
    }

    @RequestMapping("/deleteUser")
    public int deleteUser(int id){
        return user01Service.delete(id);
    }

    @RequestMapping("/getNewsById")
    public News getNewsById(int id){
        return news01Service.getNewsById(id);
    }

    @RequestMapping("/getAllNews")
    public List<News> getAllNews(){
        return news01Service.getAllNews();
    }



    @RequestMapping("/insertNews")
    public int insertNews(@RequestBody News news){
        return news01Service.insertNews(news);
    }

    @RequestMapping("/updateNews")
    public int updateNews(@RequestBody News news){
        return news01Service.updateNews(news);
    }

    @RequestMapping("/deleteNews")
    public int deleteNews(int id){
        return news01Service.deleteNews(id);
    }

}
