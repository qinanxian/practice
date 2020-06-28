package com.lihui.practice.service;

import com.lihui.practice.entity.AdminTableEntity;

import java.util.HashMap;

public interface LonginService {
    /**
     * 用户登陆
     * @param adminTableEntity
     * @return
     */
    HashMap<Object,String> getAdmin(AdminTableEntity adminTableEntity);
}
