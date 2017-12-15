package com.huige.spring.beans.relation;

import com.huige.spring.beans.autowire.Address;
import com.huige.spring.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
        /*Address address1 = (Address) ctx.getBean("address");
        System.out.println(address1);*/

        Address address2 = (Address) ctx.getBean("address2");
        System.out.println(address2);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
