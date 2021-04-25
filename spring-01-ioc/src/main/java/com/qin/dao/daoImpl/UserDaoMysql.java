package com.qin.dao.daoImpl;

import com.qin.dao.UserDao;

public class UserDaoMysql implements UserDao {
    @Override
    public void getData() {
        System.out.println("Mysql数据逻辑实现...");
    }
}
