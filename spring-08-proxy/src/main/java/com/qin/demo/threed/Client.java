package com.qin.demo.threed;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        /*通过调用程序处理角色来处理我们要调用的接口对象!*/
        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();

    }
}
