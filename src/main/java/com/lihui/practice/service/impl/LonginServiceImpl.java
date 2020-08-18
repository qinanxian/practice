package com.lihui.practice.service.impl;

import com.lihui.practice.entity.AdminTableEntity;
import com.lihui.practice.mapepr.LonginMapper;
import com.lihui.practice.service.LonginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
@Transactional
public class LonginServiceImpl implements LonginService {
    @Autowired
    LonginMapper longinMapper;
    /**
     * 用户登陆
     * @param adminTableEntity
     * @return
     */
    @Override
    public HashMap<Object,String> getAdmin(AdminTableEntity adminTableEntity) {
        HashMap<Object, String> map = new HashMap<>();
        String username = adminTableEntity.getUsername();
        String password = adminTableEntity.getPassword();
        if (username.isEmpty()){
            map.put("code","1");
        }
        AdminTableEntity admin = longinMapper.selectAdmin(adminTableEntity);

        return null;
    }
}
