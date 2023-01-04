package com.learn.weik.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/01/03-10:04
 */
@Data
@AllArgsConstructor
@ToString
public class User {
    private String name;

    private Integer age;

    /**
     * 0 男 1女
     */
    private Integer gender;
}
