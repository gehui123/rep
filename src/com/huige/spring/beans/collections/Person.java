package com.huige.spring.beans.collections;

import java.util.List;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Person {
    private String name;
    private int age;
    private List<Car>   cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
