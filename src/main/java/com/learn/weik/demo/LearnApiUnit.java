package com.learn.weik.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/01/01-19:03
 */
@Service
public interface LearnApiUnit {
    HttpServletRequest getRequest();
}
