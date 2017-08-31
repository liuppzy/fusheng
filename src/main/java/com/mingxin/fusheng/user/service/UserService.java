package com.mingxin.fusheng.user.service;

import com.mingxin.fusheng.user.domain.User;

public interface UserService {
    User selectUserById(Integer userId);  
}