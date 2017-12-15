package com.huige.spring.beans.collections;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class HelloWorld {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name set ...");
        this.name = name;
    }

    public void hello(){
        System.out.println(this.name);
    }

    public HelloWorld() {
        System.out.println("HelloWorld constructor ...");
    }
}
