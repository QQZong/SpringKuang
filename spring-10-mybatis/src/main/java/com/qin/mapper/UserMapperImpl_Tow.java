package com.qin.mapper;

import com.qin.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl_Tow extends SqlSessionDaoSupport implements UserMapper  {
    @Override
    public List<User> queryUser() {
        /*SqlSession session = getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        return mapper.queryUser();*/
        return getSqlSession().getMapper(UserMapper.class).queryUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }
}
