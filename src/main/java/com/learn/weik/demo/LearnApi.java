package com.learn.weik.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author weikun
 * @Description TODO
 * @date 2022/12/31-19:24
 */
@RestController
@RequestMapping("learnApi")
public class LearnApi {

    //region Description
    /**
     * @param name
     * @return
     */
    @PostMapping("postJsonName")
    public String postName(@RequestBody String name) {
        System.out.println("post-json:" + name);
        return name;

    }

    /**
     * @param name
     * @return
     */
    @PostMapping("postForm")
    public String postFormName(@RequestBody String name) {
        System.out.println("post-form:" + name);
        return name;

    }
    //endregion

    /**
     * @param n
     * @return
     */
    @PostMapping("postFormName")
    public String getN(@RequestParam("name") String n) {
        System.out.println("post-form:" + n);
        return n;
    }

    /**
     * @param name
     * @return
     */
    @GetMapping("getName")
    public String getName(String name) {
        System.out.println("get-form:" + name);
        return name;
    }

    @Autowired
    LearnApiUnit learnApiUnit;

    /**
     * 测试request
     * @return
     */
    @GetMapping("getRequest")
    public void getRequest() {
        String url = learnApiUnit.getRequest().getHeader("url");
        System.out.println(learnApiUnit.getRequest().getParameter("name"));
        System.out.println("url:"+url);
//        return learnApiUnit.getRequest().getParameter("name");
    }
}
