package com.example.demo0;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里用一句话描述这个方法的作用
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/7/12      李彦军       v1.0.0       create
 * -----------------------------------------------------------------
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/")
    public String demo(){
        return "hello world,my port is " + port;
    }


}
