package com.huige.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 *
 *返回通知、异常通知
 * @Author huige@iflytek.com
 * @Date 2017/12/11.
 * 把一个类申请为切面类，首先需要把类加到IOC容器中@Component
 * 添加了@Aspect @Order 指定切面优先级,值越小,优先级越高
 */

public class LoggingAspect {

    public void beforeMethod(){
        System.out.println("The method begin");
    }
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("The method " + methodName + " Begins with " + Arrays.asList(args));
    }

    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("The method " + methodName + " Ends with " + Arrays.asList(args));
    }

    public void afterReturing(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("The method " + methodName + " Ends with " + result);
    }


    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " Ends with " + ex);
    }

    public Object aroundMethod(ProceedingJoinPoint pjd) {
        Object result = null;
        String methodName = pjd.getSignature().getName();
        //前置通知
        System.out.println("The method "+methodName+ "begins with "+ Arrays.asList(pjd.getArgs()));
        try {
            result = pjd.proceed();
            //后置通知
            System.out.println("The method ends with "+ result);
        } catch (Throwable e) {
            System.out.println("The method "+methodName+" occurs exeception:"+e);
            throw new RuntimeException(e);
        }
        //后置通知
        System.out.println("The method "+methodName+ " ends");
        return  result;
    }

}
