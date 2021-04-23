package com.yc.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 读取属性配置文件
 */
@ConfigurationProperties(prefix = "yc.starter")
public class HelloProperties {
    private String content;
    private String name;

    public HelloProperties(){
        System.out.println("HelloProperties初始化");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
