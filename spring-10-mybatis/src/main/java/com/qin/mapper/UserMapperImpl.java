package com.qin.mapper;

import com.qin.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import java.util.List;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> queryUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.queryUser();
    }
}
