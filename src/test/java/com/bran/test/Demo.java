package com.bran.test;

import com.bran.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//测试类
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {

    @Resource(name = "user")
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}
