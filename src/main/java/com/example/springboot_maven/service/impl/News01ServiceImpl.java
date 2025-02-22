package com.example.springboot_maven.service.impl;

import com.example.springboot_maven.mapper.News01Dao;
import com.example.springboot_maven.pojo.News;
import com.example.springboot_maven.service.News01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class News01ServiceImpl implements News01Service {

    @Autowired
    private News01Dao news01Dao;

    @Override
    public News getNewsById(int id) {
        return news01Dao.getNewsById(id);
    }

    @Override
    public List<News> getAllNews() {
        return news01Dao.getAllNews();
    }

    @Override
    public int insertNews(News news) {
        return news01Dao.insertNews(news);

//        return news01Dao.addNews(news);
    }

    @Override
    public int updateNews(News news) {
        return news01Dao.updateNews(news);
    }

    @Override
    public int deleteNews(int id) {
        return news01Dao.deleteNews(id);
    }


}
