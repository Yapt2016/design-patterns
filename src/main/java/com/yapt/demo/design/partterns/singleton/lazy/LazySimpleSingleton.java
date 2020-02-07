package com.yapt.demo.design.partterns.singleton.lazy;

/**
 * 懒汉式之普通实现
 * @author hurui
 * @version Id: LazySimpleSingleton.java, v 0.1 2020/2/4 16:04 YaphetS Exp $$
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton SINGLETON = null;

    private LazySimpleSingleton(){

    }

    /**
     * 这种写法会有线程安全问题
     * @return
     */
    public static LazySimpleSingleton getInstance(){
        if(SINGLETON == null){
            SINGLETON =  new LazySimpleSingleton();
        }
        return SINGLETON;
    }
}