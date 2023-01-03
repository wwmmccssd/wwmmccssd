package com.learn.weik;

import org.springframework.web.bind.annotation.*;

/**
 * @author weikun
 * @Description TODO
 * @date 2022/12/31-19:24
 */
@RestController
@RequestMapping("learnApi")
public class LearnApi {

    /**
     * @param name
     * @return
     */
    //region Description
    @PostMapping("postJsonName")
    public String postName(@RequestBody String name) {
        System.out.println("post-json:" + name);
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

//    @Autowired
//    LearnApiUnit learnApiUnit;
//
//    /**
//     * @return
//     */
//    @GetMapping("getRequest")
//    public String getRequest() {
//        learnApiUnit.getRequest().getHeader("url");
//        System.out.println(learnApiUnit.getRequest().getParameter("name"));
//        return learnApiUnit.getRequest().getParameter("name");
//    }
}
