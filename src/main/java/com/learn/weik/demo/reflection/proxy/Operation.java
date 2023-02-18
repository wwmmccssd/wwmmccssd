package com.learn.weik.demo.reflection.proxy;

import java.util.function.Supplier;

/**
 * @author weikun
 * @Description 包含一个描述和一个命令 这是一种命令模式 被定义为函数式接口的引用。
 * @date 2023/02/16-20:33
 */
public record Operation(Supplier<String> description, Runnable command) {
}
