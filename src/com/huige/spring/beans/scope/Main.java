package com.huige.spring.beans.scope;

import com.huige.spring.beans.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
        Car car = (Car) ctx.getBean("car");
        Car car1 = (Car) ctx.getBean("car");
        System.out.println(car == car1);

    }
}
