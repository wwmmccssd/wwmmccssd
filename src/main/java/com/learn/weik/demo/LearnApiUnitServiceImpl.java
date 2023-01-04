package com.learn.weik.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/01/01-19:04
 */
@Service
public class LearnApiUnitServiceImpl implements LearnApiUnit{
    @Override
    public HttpServletRequest getRequest() {
        return (HttpServletRequest) RequestContextHolder.getRequestAttributes();
    }
}
