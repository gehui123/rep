package com.huige.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
@Repository
public class UserJdbcRepository implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save...");
    }
}
