package com.qin.demo.fore;

import com.qin.demo.threed.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    /*被代理的接口*/
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    /*生成得到代理类*/
    public Object getProxy(){
        /*
        * this.getClass().getClassLoader() 获取类的位置
        *  rent.getClass().getInterfaces() 获取接口位置
        * this ☞InvocationHandler
        * */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(),this);
    }

    /*处理代理实例，并返回结果*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*动态代理的本质就是使用反射机制实现！*/
         return method.invoke(object,args);
    }
}
