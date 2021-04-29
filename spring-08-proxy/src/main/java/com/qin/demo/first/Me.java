package com.qin.demo.first;

public class Me {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
        proxy.seeHouse();
    }
}
