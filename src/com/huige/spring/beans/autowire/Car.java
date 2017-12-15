package com.huige.spring.beans.autowire;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Car {
    private String brand;
    private double price;

    public Car() {
        System.out.println("Car constructor ..");
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
