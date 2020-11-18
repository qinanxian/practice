package com.lihui.springlx.dao.impl;

import com.lihui.springlx.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户信息");
    }
}
