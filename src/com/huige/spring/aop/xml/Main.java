package com.huige.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/11.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-aop-xml.xml");
        Arithmeticcalculator arithmeticcalculator = (Arithmeticcalculator) ctx.getBean("arithmeticcalculator");
        int result1 =arithmeticcalculator.div(3,1);
        System.out.println("result1 : "+result1);
    }


}
