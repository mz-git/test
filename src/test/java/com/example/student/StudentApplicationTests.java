package com.example.student;

import com.example.student.entity.User;
import com.example.student.service.RedisTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void test()  {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("jia", "111");
    }

    @Autowired
    RedisTemplateService redisTemplateService;
    @Test
    public void redisTest(){

        User user = new User();
        user.setId(11);
        user.setUserName("test");
        user.setPassWord("hello redis");
        redisTemplateService.set("key1",user);

        User us = redisTemplateService.get("key1",User.class);
        System.out.println(us.getUserName()+":  "+us.getPassWord());
    }

}
