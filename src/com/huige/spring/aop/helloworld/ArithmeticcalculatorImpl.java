package com.huige.spring.aop.helloworld;

/**
 * @Author huige@iflytek.com
 * @Date 2017/12/10.
 */
public class ArithmeticcalculatorImpl implements Arithmeticcalculator {
    @Override
    public int add(int i, int j) {
        int result= i+j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i-j;

        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i*j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result =i/j;
        return result;
    }
}
