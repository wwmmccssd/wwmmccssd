package com.learn.weik;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/01/01-19:04
 */
public class LearnApiUnitServiceImplements implements LearnApiUnit{
    @Override
    public HttpServletRequest getRequest() {
        return (HttpServletRequest) RequestContextHolder.getRequestAttributes();
    }
}
