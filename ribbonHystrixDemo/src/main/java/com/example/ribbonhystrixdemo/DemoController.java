package com.example.ribbonhystrixdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里用一句话描述这个方法的作用
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/7/13      李彦军       v1.0.0       create
 * -----------------------------------------------------------------
 */
@RestController
public class DemoController {

    @Autowired
    DemoService demoService;


    @RequestMapping(value = "/")
    public String demo(){
       return demoService.demoService();
    }




}
