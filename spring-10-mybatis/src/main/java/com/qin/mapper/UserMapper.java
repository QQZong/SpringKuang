package com.qin.mapper;

import com.qin.entity.User;
import java.util.List;

public interface UserMapper {
    public List<User> queryUser();
    public int addUser(User user);
}
