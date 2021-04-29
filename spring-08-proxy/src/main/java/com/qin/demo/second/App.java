package com.qin.demo.second;

public class App {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        ServiceProxy proxy = new ServiceProxy(service);
        proxy.add();
    }
}
