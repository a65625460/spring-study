package com.kuang.service;

import com.kuang.dao.UserDao;

public interface UserService {
    void getUser();

    void setUserDao(UserDao userDao);
}
