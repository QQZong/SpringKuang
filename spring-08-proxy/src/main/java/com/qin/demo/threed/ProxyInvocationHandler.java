package com.qin.demo.threed;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    /*被代理的接口*/
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /*生成得到代理类*/
    public Object getProxy(){
        /*
        * this.getClass().getClassLoader() 获取类的位置
        *  rent.getClass().getInterfaces() 获取接口位置
        * this ☞InvocationHandler
        * */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }
    /*处理代理实例，并返回结果*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*动态代理的本质就是使用反射机制实现！*/
         return method.invoke(rent,args);
    }
}
