package com.example.springboot_maven.service;

import com.example.springboot_maven.pojo.News;

import java.util.List;

public interface News01Service {

    News getNewsById(int id);

    List<News> getAllNews();

    int insertNews(News news);

    int updateNews(News news);

    int deleteNews(int id);
}
