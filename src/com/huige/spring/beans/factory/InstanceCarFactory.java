package com.huige.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */

/**
 * 实例工厂方法:实例工厂的方法，即需要创建工厂本身，再调用工厂方法
 *
 * */
public class InstanceCarFactory {

    private Map<String,Car> cars =null;

    public InstanceCarFactory(){
        cars =new HashMap<String, Car>();
        cars.put("audi",new Car("audi",200000));
        cars.put("BMW",new Car("BMW",300000));
    }
    public  Car getCar(String name){
        return cars.get(name);
    }
}
