package com.mingxin.fusheng.user.dao;

import com.mingxin.fusheng.user.domain.User;

public interface UserDao {

    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  

}
