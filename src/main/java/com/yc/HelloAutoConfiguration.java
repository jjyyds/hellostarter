package com.yc;

import com.yc.properties.HelloProperties;
import com.yc.services.HelloService;
import com.yc.services.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)//启用配置属性类，以读取属性文件中对应的值
@ConditionalOnProperty(prefix = "yc",name = "enabled",havingValue = "true",matchIfMissing = true)
public class HelloAutoConfiguration {

    @Autowired
    private HelloProperties helloProperties;

    public HelloAutoConfiguration(){
        System.out.println("HelloAutoConfiguration初始化");
    }

    @Bean
    public IHelloService helloService(){
        return new HelloService(helloProperties.getContent(),helloProperties.getName());
    }

}
