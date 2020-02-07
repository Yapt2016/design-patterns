package com.yapt.demo.design.partterns.singleton.test;

import com.yapt.demo.design.partterns.singleton.lazy.LazySimpleSingleton;

/**
 * @author hurui
 * @version Id: ExecutorThread.java, v 0.1 2020/2/4 18:03 YaphetS Exp $$
 */
public class ExecutorThread implements Runnable{

    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);
    }
}