package com.example.ribbonhystrixdemo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 这里用一句话描述这个方法的作用
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/7/13      李彦军       v1.0.0       create
 * -----------------------------------------------------------------
 */
@Service
public class DemoService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "demoErr")
    public String demoService(){

        return restTemplate.getForObject("http://COREDEMO/",String.class);
    }


    public String demoErr(){
        return "demo,err";
    }


}
