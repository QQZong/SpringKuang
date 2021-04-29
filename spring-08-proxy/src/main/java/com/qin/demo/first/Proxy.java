package com.qin.demo.first;

public class Proxy implements Rent {
    Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    /*代理*/
    @Override
    public void rent() {
        host.rent();
        seeHouse();
        takeMoney();
    }

    /*中介带你看房*/
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void takeMoney(){
        System.out.println("中介收中介费...");
    }
}
