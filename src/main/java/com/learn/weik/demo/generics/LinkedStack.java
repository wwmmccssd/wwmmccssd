package com.learn.weik.demo.generics;

/**
 * @author weikun
 * @Description 栈类 （用内部链式结构实现的栈）
 *   这个例子中使用了一个末端哨兵来判断堆栈何时为空。这个末端哨兵是在构造LinkedStack的时候创建的，
 *   然后，每调用一次push()方法，就会创建一个Node<T>对象，并将其连接到前一个Node<T>对象。当你调用pop()方法时，总
 *   是返回top.item，然后丢弃当前top所指的Node<T>,并将top转移到下一个Node<T>,除非你已经碰到了末端哨兵，
 *   这个时候就不能再移动top了。如果已经到了末端，客户端程序还继续调用pop()方法，它只能得到null,说明堆栈已经空了。
 *   当堆栈为空的时候，这个末端哨兵就为空了，当往堆栈里面添加数据的时候，末端哨兵被压入底部。
 * @date 2023/02/18-20:45
 */
public class LinkedStack<T> {
    //region Node 内部类
    private static class Node<U> {
        U item;//节点的值
        Node<U> next;//前一个节点
        Node() {item = null; next = null;}

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        /**
         * 用于判断栈是否为空，也就是是否遇到末端哨兵
         *
         * @return
         */
        boolean end() {
            return item == null && next == null;
        }
    }
    //endregion

    /**
     * 末端哨兵
     */
    private Node<T> top = new Node<>();

    /**
     * 入栈
     *
     * @param item
     */
    public void push(T item) {
        //当有新的值插入时，改变top指向，改变top之前将top下压
        top = new Node<>(item, top);
    }

    /**
     * 出栈
     *
     * @return
     */
    public T pop() {
        //出栈时每次都取最顶上的值
        T result = top.item;
        //判断是否遇到末端哨兵
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

}
