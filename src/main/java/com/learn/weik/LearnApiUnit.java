package com.learn.weik;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/01/01-19:03
 */
public interface LearnApiUnit {
    @PostMapping("getRequest")
    HttpServletRequest getRequest();
}
