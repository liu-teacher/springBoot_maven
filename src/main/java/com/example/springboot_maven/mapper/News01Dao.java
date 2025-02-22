package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface News01Dao {

    News getNewsById(int id);

    List<News> getAllNews();

    int insertNews(News news);
    int addNews(News news);

    int updateNews(News news);

    int deleteNews(int id);
}
