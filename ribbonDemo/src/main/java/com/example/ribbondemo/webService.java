package com.example.ribbondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 这里用一句话描述这个方法的作用
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/7/12      李彦军       v1.0.0       create
 * -----------------------------------------------------------------
 */
@Service
public class webService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(){
        return restTemplate.getForObject("http://COREDEMO/",String.class);
    }



}
