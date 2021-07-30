package com.zpf.community.service;

import com.zpf.community.dao.UserMapper;
import com.zpf.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zpf
 * @createTime 2021-07-30 13:44
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
