package com.mingxin.fusheng.user.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mingxin.fusheng.user.domain.User;
import com.mingxin.fusheng.user.service.UserService;


@Controller  
public class UserController {  

    @Resource  
    private UserService userService;  

    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("login");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    
}  