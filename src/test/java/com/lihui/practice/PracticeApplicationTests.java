package com.lihui.practice;

import com.lihui.practice.entity.AdminTableEntity;
import com.lihui.practice.mapepr.LonginMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {
    @Autowired
    LonginMapper longinMapper;
    @Test
    void longin() {
        AdminTableEntity adminTableEntity = new AdminTableEntity();
        adminTableEntity.setUsername("lihui");
        adminTableEntity.setPassword("000000");
        AdminTableEntity admin = longinMapper.selectAdmin(adminTableEntity);
        System.out.println(admin);
    }

}
