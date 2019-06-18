package com.chengw.tiafs.test;

import com.chengw.tiafs.model.Article;
import com.chengw.tiafs.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void redis() {

        Map a = new HashMap();

        Article article = new Article();
        article.setAId(1);
        article.setAName("redis");
        article.setAPath("F:/");
        article.setPublishDate(new Date().toString());
        article.setPublishReader("chengw");
        article.setUploadDate("today");

        a.put("article",article);
        redisUtil.hset("article","AId",article.getAId());
        redisUtil.hset("article","AName",article.getAName());
        redisUtil.hset("article","APath",article.getAPath());
        redisUtil.hset("article","PublishDate",article.getPublishDate());
        redisUtil.hset("article","PublishReader",article.getPublishReader());
        redisUtil.hset("article","uploadDate",article.getUploadDate());





        //redisUtil.hmset("article",a);
        //redisUtil.hdel("article",fields);
        // redisUtil.del("article");


    }

}

