package com.huige.spring.beans.annotation.repository;

import com.huige.spring.beans.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/8.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepository Save ...");
    }
}
