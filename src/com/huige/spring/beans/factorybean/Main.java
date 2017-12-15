package com.huige.spring.beans.factorybean;

import com.huige.spring.beans.factory.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factorybean.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }
}
