package com.huige.spring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 *
 * 动态代理
 */
public class ArithmetiCalculatorLoggingProxy {

    //要代理的对象
    private Arithmeticcalculator target;

    public ArithmetiCalculatorLoggingProxy(Arithmeticcalculator target){
        this.target = target;
    }

    public Arithmeticcalculator getLoggingProxy(){
        Arithmeticcalculator proxy =null;

        //代理对象由哪个类加载器负责加载
        ClassLoader loader = target.getClass().getClassLoader();
        //代理对象的类型，即其中有哪些方法
        Class [] interfaces = new Class[]{Arithmeticcalculator.class};

        //当调用代理对象其中的方法时，该执行的代码
        InvocationHandler h  = new InvocationHandler() {
            /**
             * Proxy：正在返回的代理对象，一般情况下，在invoke 方法中都不使用
             *
             * method: 正在被调用的方法、
             * args： 调用方法是，传入参数
            * */

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                //日志
                System.out.println("The method"+methodName+" begins with "+ Arrays.asList(args));
                //执行方法
                Object result = method.invoke(target,args);
                //日志
                System.out.println("The method"+methodName+" ends with "+ result.toString());
                return 0;
            }
        };
        proxy = (Arithmeticcalculator) Proxy.newProxyInstance(loader,interfaces,h);
        return proxy;
    }
}
