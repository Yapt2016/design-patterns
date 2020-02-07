package com.yapt.demo.design.partterns.singleton.test;

/**
 * @author hurui
 * @version Id: LazySimpleSingletonTest.java, v 0.1 2020/2/4 18:01 YaphetS Exp $$
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Thread End");
    }
}