package com.huige.spring.beans.annotation;

import com.huige.spring.beans.annotation.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/8.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
        UserController uc = (UserController) ctx.getBean("userController");
        uc.execute();
        System.out.println(uc);

       /* UserRepository ur = (UserRepository) ctx.getBean("userRepository");
        System.out.println(ur);

        UserService us = (UserService) ctx.getBean("userService");
        System.out.println(us);*/

    }
}
