package com.example.feigndemo;

import org.springframework.stereotype.Component;

/**
 * 这里用一句话描述这个方法的作用
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/7/13      李彦军       v1.0.0       create
 * -----------------------------------------------------------------
 */
@Component
public class SchedualServiceHystric implements SchedualService {

    @Override
    public String demo() {
        return "Demo err";
    }
}
