package com.huige.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 验证切面
 *切面优先级定义@Order
 * @Author huige@iflytek.com
 * @Date 2017/12/14.
 */

public class ValidateArgs {

    public void validateArgs(JoinPoint joinPoint){
        System.out.println("-->validate: "+ Arrays.asList(joinPoint.getArgs()));
    }
}
