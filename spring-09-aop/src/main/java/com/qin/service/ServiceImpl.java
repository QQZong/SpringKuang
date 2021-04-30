package com.qin.service;

public class ServiceImpl implements Service{
    @Override
    public void add() {
        log("ADD");
        System.out.println("添加方法被执行了...");
    }

    @Override
    public void delete() {
        log("DELETE");
        System.out.println("删除方法被执行了...");
    }

    @Override
    public void update() {
        log("UPDATE");
        System.out.println("更新方法被执行了...");
    }

    @Override
    public void query() {
        log("QUERY");
        System.out.println("查询方法被执行了...");
    }
    public void log(String meth){
        System.out.println("执行了"+meth+"方法...");
    }
}
