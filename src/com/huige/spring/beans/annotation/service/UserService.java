package com.huige.spring.beans.annotation.service;

import com.huige.spring.beans.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/8.
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("userJdbcRepository")
    private UserRepository userRepository;

    public void add(){
        System.out.println("UserService add...");
        userRepository.save();
    }

}
