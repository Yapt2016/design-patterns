package com.yapt.demo.design.partterns.singleton.lazy;

/**
 * 懒汉式之静态内部类实现
 * @author hurui
 * @version Id: LazyInnerClassSingleton.java, v 0.1 2020/2/4 20:53 YaphetS Exp $$
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyHolder.SINGLETON != null){
            throw new RuntimeException("不可创建更多的实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.SINGLETON;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton SINGLETON = new LazyInnerClassSingleton();
    }
}