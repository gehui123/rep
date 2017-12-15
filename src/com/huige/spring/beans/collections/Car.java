package com.huige.spring.beans.collections;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Car {

    private String brand;
    private String corp;
    private int price;
    private int maxSpeed;

    public Car() {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
