package com.huige.spring.beans.factory;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */



import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法:直接调用某个类的静态方法就可以访问Bean的实例
 * */
public class StaticCarFactory {
    private static Map<String,Car> cars = new HashMap<String, Car>();
    static {
        cars.put("audi",new Car("audi",200000));
        cars.put("BMW",new Car("audi",300000));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
