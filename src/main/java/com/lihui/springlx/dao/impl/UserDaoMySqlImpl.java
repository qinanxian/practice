package com.lihui.springlx.dao.impl;

import com.lihui.springlx.dao.UserDao;

public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
