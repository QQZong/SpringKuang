package com.qin;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect/*标注这是一个切面*/
public class AnnotationPointCut {
    @Before("execution(* com.qin.service.ServiceImpl.*(..))")
    public void before(){
        System.out.println("注解-方法执行前...");
    }
    @After("execution(* com.qin.service.ServiceImpl.*(..))")
    public void after(){
        System.out.println("注解-方法执行后...");
    }
    @Around("execution(* com.qin.service.ServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前...");
        Object proceed = point.proceed();
        System.out.println("环绕后...");
    }
}
