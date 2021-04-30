package com.qin.log;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class LogDemo implements MethodBeforeAdvice {
    /**
     *
     * @param method    要执行的目标对象方法
     * @param objects   参数
     * @param o     目标对象
     * @throws Throwable    异常
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getClass().getName()+"执行了"+method.getName());
    }
}
