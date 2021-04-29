package com.qin.demo.fore;

import com.qin.demo.second.Service;
import com.qin.demo.second.ServiceImpl;

public class Clion {
    public static void main(String[] args) {
        /*真实角色*/
        ServiceImpl service = new ServiceImpl();
        /*角色-调用公式类*/
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        /*设置要代理的对象*/
        handler.setObject(service);
        Service proxy = (Service) handler.getProxy();
        proxy.add();

    }
}
