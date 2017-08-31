package com.mingxin.fusheng.user.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;

import com.mingxin.fusheng.user.baseTest.SpringTestCase;
import com.mingxin.fusheng.user.domain.User;  



public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUser_name() + ":" + user.getUser_pwd());
    }  
}