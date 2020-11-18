package com.lihui.springlx.service.impl;


import com.lihui.springlx.dao.UserDao;
import com.lihui.springlx.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
