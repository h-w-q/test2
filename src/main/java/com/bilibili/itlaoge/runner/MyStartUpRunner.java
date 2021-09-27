package com.bilibili.itlaoge.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author hw
 * @version 1.0
 * 项目启动进行一些初始化操作
 * @date 2021-09-16 22:59
 */
@Component
public class MyStartUpRunner implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public void run(String... args) throws Exception {
        //redisTemplate.opsForSet().add("test","1");

    }
}
