package com.huige.spring.beans.cycle;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Car {

    public Car() {
        System.out.println("Car‘s Constructor");

    }
    private String brand;

    public void setBrand(String brand) {
        System.out.println("set brand ...");
        this.brand = brand;
    }

    public  void initCar(){
        System.out.println("Car init ...");
    }

    public void destroyCar(){
        System.out.println("Car destory ...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
