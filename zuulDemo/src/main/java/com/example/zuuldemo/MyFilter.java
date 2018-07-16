package com.example.zuuldemo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 这里用一句话描述这个方法的作用
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/7/13      李彦军       v1.0.0       create
 * -----------------------------------------------------------------
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext rcx = RequestContext.getCurrentContext();
        HttpServletRequest request = rcx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        String token = request.getParameter("token");
        if(null == token || "".equals(token)){
            rcx.setSendZuulResponse(false);
            rcx.setResponseStatusCode(401);
            try {
                rcx.getResponse().sendRedirect("https://www.xiaolieba.com");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }



        return null;
    }
}
