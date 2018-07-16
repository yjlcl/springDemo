package com.example.feigndemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 这里用一句话描述这个方法的作用
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/7/13      李彦军       v1.0.0       create
 * -----------------------------------------------------------------
 */
@Service
@FeignClient(value = "COREDEMO" ,fallback = SchedualServiceHystric.class)
public interface SchedualService {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    String demo();



}
