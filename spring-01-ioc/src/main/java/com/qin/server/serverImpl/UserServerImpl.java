package com.qin.server.serverImpl;

import com.qin.dao.UserDao;
import com.qin.server.UserServer;

public class UserServerImpl implements UserServer {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getData() {
        userDao.getData();
    }
}
