package com.qin.dao.daoImpl;

import com.qin.dao.UserDao;

public class UserDaoOracle implements UserDao {
    @Override
    public void getData() {
        System.out.println("Oracle数据逻辑实现...");
    }
}
