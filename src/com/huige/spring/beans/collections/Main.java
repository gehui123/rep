package com.huige.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Main {
    public static void main(String[] args) {
        /*HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("gehui");
        helloWorld.hello();*/

       //1.创建Spring 的IOC容器对象
           ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. 从IOC 容器中获取Bean 实例2步骤:构造器+ set访问
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        helloWorld.hello();

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
        System.out.println(newPerson);
    }
}
