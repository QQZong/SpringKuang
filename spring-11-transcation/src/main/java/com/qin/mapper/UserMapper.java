package com.qin.mapper;

import com.qin.pojo.User;
import java.util.List;

public interface UserMapper {
    /*查询所有用户*/
    public List<User> queryUser();
    /*添加用户*/
    public int addUser(User user);
    /*删除用户*/
    public int deleteUser(int id);
}
