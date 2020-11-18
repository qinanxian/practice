package com.lihui.practice;


import com.lihui.springlx.dao.impl.UserDaoMySqlImpl;
import com.lihui.springlx.dao.impl.UserDaoOracleImpl;
import com.lihui.springlx.entity.Hello;
import com.lihui.springlx.service.UserService;
import com.lihui.springlx.service.impl.UserServiceImpl;
import org.apache.ibatis.javassist.ClassPath;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

@SpringBootTest
public class GoodLuck {
    UserServiceImpl userService=new UserServiceImpl();
    @Test
    void Tests() {
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }

    @Test
    void Tests1() {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lx.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
