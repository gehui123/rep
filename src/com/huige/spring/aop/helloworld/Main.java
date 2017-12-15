package com.huige.spring.aop.helloworld;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class Main {

    public static void main(String[] args) {
        Arithmeticcalculator target = new ArithmeticcalculatorImpl();
        Arithmeticcalculator proxy = new ArithmetiCalculatorLoggingProxy(target).getLoggingProxy();

        proxy.add(3,4);
        proxy.div(12,4);
        proxy.sub(5,4);
        proxy.mul(3,4);
    }

}
