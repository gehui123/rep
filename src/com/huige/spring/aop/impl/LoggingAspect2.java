package com.huige.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *
 *返回通知、异常通知
 * @Author huige@iflytek.com
 * @Date 2017/12/11.
 * 把一个类申请为切面类，首先需要把类加到IOC容器中@Component
 * 添加了@Aspect @Order 指定切面优先级,值越小,优先级越高
 */
/**
*  重用切点表达式
* */
@Order(2)
@Component
@Aspect
public class LoggingAspect2 {
    /**
    *  重用切点表达式
     *  使用@Piontcut 用于声明切入点表达式
    * */
    @Pointcut("execution(* com.huige.spring.aop.impl.ArithmeticcalculatorImpl.*(..))")
    public void declareJoinPointExpression(){}


    //声明该方法是一个前置通知:在目标方法开始之前执行
    @Before("declareJoinPointExpression()")
    public void beforeMethod(){
        System.out.println("The method begin");
    }
    @Before("declareJoinPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("The method " + methodName + " Begins with " + Arrays.asList(args));
    }

    //后置通知: 在目标方法完成之后、或者抛异常都执行。
    //在后置通知中还不能访问目标方法的结果
    @After("declareJoinPointExpression()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("The method " + methodName + " Ends with " + Arrays.asList(args));
    }

    //返回通知:是可以访问到方法的返回值
    @AfterReturning(value = "declareJoinPointExpression()",returning ="result")
    public void afterReturing(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("The method " + methodName + " Ends with " + result);
    }

    //异常通知:在目标方法出现异常时会执行的代码，可以访问异常对象，且可以指定出现特定异常时再执行
    @AfterThrowing(value = "declareJoinPointExpression()",
            throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method " + methodName + " Ends with " + ex);
    }
    /*
    * 环绕通知需要携带ProceedingJoinPoint 类型的参数
    * 环绕通知类似于动态代理的全过程:ProceedingJoinPoint 类型的参数可以决定是否执行目标方法
    * */
    @Around("declareJoinPointExpression()")
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
