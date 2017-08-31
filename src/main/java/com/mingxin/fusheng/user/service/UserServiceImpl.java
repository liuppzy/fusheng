package com.mingxin.fusheng.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingxin.fusheng.user.dao.UserDao;
import com.mingxin.fusheng.user.domain.User;

@Service  
public class UserServiceImpl implements UserService {

    @Autowired  
    private UserDao userDao;  

    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  

    }  
}