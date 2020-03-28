package com.wangzhan.springboot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//第二种读取配置文件准备的类
@Component
@ConfigurationProperties(prefix = "boot")
public class ConfigInfo {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;


    }
}
