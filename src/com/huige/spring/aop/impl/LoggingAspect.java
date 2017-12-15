package com.huige.spring.aop.impl;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

/**
 * 前置通知、后置通知
 *
 * @Author huige@iflytek.com
 * @Date 2017/12/11.
 * 把一个类申请为切面类，首先需要把类加到IOC容器中@Component
 * 添加了@Aspect
 */


public class LoggingAspect {

    //声明该方法是一个前置通知:在目标方法开始之前执行
    @Before("execution(public int com.huige.spring.aop.impl.ArithmeticcalculatorImpl.div(int,int ))")
    public void beforeMethod(){
        System.out.println("The method begin");
    }

    //后置通知: 在目标方法完成之后、或者抛异常都执行。
    //在后置通知中还不能访问目标方法的结果
    @After("execution(public int com.huige.spring.aop.impl.ArithmeticcalculatorImpl.div(int,int ))")
    public void endMethod(){
        System.out.println("The method end");
    }
}
