package com.huige.spring.beans.cycle;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
*  Bean 后置处理器
* */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:"+beanName+", "+beanName);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:"+beanName+", "+beanName);
        Car car =new Car();
        car.setBrand("BMW");
        return car;
    }
}
