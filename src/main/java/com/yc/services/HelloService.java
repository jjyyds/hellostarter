package com.yc.services;

/**
 * 业务类
 */
public class HelloService implements IHelloService {

    private String content;
    private String name;

    public HelloService(String content, String name) {
        this.content = content;
        this.name = name;
    }

    @Override
    public String say(){
        return this.name+"说:"+this.content;
    }
}
