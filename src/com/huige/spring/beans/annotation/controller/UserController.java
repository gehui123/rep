package com.huige.spring.beans.annotation.controller;

import com.huige.spring.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/8.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void execute(){
        System.out.println("UserController execute ...");
        userService.add();
    }
}
