package com.example.feigndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    SchedualService schedualService;


    @RequestMapping(value = "/12" , method = RequestMethod.GET)
    public String demo(){
        return schedualService.demo();
    }


}
