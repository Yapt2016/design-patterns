package com.yapt.demo.design.partterns.singleton.hungry;

/**
 *
 * 饿汉式单例：在单例类首次加载的时候就创建实例，
 * 缺点：浪费内存空间
 * @author hurui
 * @version Id: HungrySingleton.java, v 0.1 2020/2/4 15:46 YaphetS Exp $$
 */
public class HungrySingleton {

    private static final HungrySingleton SINGLETON = new HungrySingleton();

    /**
     * 单例模式永远要将构造器私有化
     */
    private HungrySingleton(){

    }

    /**
     * 并提供全局唯一一个访问点
     * @return
     */
    public static HungrySingleton getInstance(){
        return SINGLETON;
    }
}