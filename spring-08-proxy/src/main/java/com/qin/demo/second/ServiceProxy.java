package com.qin.demo.second;

public class ServiceProxy implements Service{
    public ServiceImpl service;

    public ServiceProxy(ServiceImpl service) {
        this.service = service;
    }

    @Override
    public void add() {
        log("添加");
        service.add();
    }

    @Override
    public void update() {
        log("修改");
        service.add();
    }

    @Override
    public void del() {
        log("删除");
        service.add();
    }

    @Override
    public void query() {
        log("查询");
        service.add();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法。");
    }
}
