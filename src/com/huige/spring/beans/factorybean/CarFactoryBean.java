package com.huige.spring.beans.factorybean;

import com.huige.spring.beans.factory.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 *
 * 配置bean的第4种方式,factoryBean
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String brand ;
    public void setBrand(String brand){
        this.brand =brand;
    }


    //返回bean 的对象
    @Override
    public Car getObject() throws Exception {
        return new Car(brand,5000000);
    }
    //返回 bean 的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    //返回的 bean 是否为单实例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
