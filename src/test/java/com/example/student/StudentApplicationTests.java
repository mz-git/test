package com.example.student;

import com.example.student.controller.CourseController;
import com.example.student.entity.User;
import com.example.student.entity.ZtRecord;
import com.example.student.mapper.ZtRecordMapper;
import com.example.student.service.RedisTemplateService;
import com.example.student.utils.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    ZtRecordMapper ztRecordMapper;

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

    @Test
    public void test1(){
        ZtRecord r = new ZtRecord();
        DateUtils.getCurrentDateStr();
        r.setOperDesc("系统用户在"+DateUtils.getCurrentDateStr()+"进行测试");
        r.setOperTime(LocalDateTime.now());
        r.setTaskId(1111L);
        //ztRecordMapper.insert(r);
        String s = "123321234";
        ttt1(s);
        System.out.println("======="+s);
        int i=111;
        ttt2(i);
        System.out.println("=====i="+i);
        Integer ii = 11111;
        System.out.println(ii);
        StringBuffer sb = new StringBuffer("sdasd");
        ttt1(sb);
        System.out.println("sb:"+sb);
    }
    public void ttt1(String s1){
        s1 = "";
    }
    public void ttt2(int i){
        i=0;
    }
    public void ttt1(Integer i){
        i = 22222;
    }
    public void ttt1(StringBuffer sb){
        sb.append("1111");
    }

    String a = "a";
    String b = "a";

//    BigDecimal 数据计算防止丢失精度

}
