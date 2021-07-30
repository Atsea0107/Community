package com.zpf.community.dao;

import com.zpf.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zpf
 * @createTime 2021-07-30 10:38
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
