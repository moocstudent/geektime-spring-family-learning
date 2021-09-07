package com.example.mademo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;

/**
 * 通过@Value注入Resource
 * @see Resource
 */
@SpringBootApplication
public class MaDemoApplication {

    @Value("classpath:default.properties")
    private Resource defaultResource;

    @PostConstruct
    public void init(){
        System.out.println(ResourceUtil.getContent(defaultResource));
    }

    public static void main(String[] args) {
        SpringApplication.run(MaDemoApplication.class, args);
    }

}
