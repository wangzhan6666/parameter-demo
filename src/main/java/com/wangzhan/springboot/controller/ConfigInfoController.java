package com.wangzhan.springboot.controller;


import com.wangzhan.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {

    //通过注解@Value，将配置文件中的参数注入进来
    //第一种读取配置的方式
    @Value("${boot.name}")
    private String name;
    @Value("${boot.location}")
    private String location;

    //第二种读取配置的方式：通过一个类的注入
    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/config")
    public @ResponseBody String configInfo () {
        return "第一种读取配置的方式：" + name + "----" + location
                +"\n"+"第二种读取配置的方式："+configInfo.getName() + "----" + configInfo.getLocation();
    }


}
