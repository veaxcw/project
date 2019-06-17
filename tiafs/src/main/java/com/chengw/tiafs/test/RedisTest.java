package com.chengw.tiafs.test;

import com.chengw.tiafs.po.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

/**
 * Redis 测试
 * @author chengw
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
        jedis.auth("xveacw8023");
        int i = 0;
        try {
            long start = System.currentTimeMillis();

            while (true){
                long end = System.currentTimeMillis();
                if((end - start) > 1000){
                    break;
                }
                i++;
                jedis.set("test"+i,i+"");

            }
        } finally {
            jedis.close();
        }
        System.out.println("redis 一秒内操作："+ i + "次");
    }

    @Test
    public void Test(){
        Role role  = new Role();
        role.setId(1L);
        role.setName("chengw");

        //redisTemplate.opsForValue().set("chengw",role);

        SessionCallback<Role> sessionCallback = new SessionCallback<Role>() {
            @Override
            public <K, V> Role execute(RedisOperations<K, V> redisOperations) throws DataAccessException {
                redisOperations.boundValueOps((K) "chengw").set((V) role);
                return null;
            }
        };
        redisTemplate.execute(sessionCallback);


    }

}
