package com.yapt.demo.design.partterns.singleton.hungry;

/**
 * @author hurui
 * @version Id: HungryStaticSingleton.java, v 0.1 2020/2/4 15:46 YaphetS Exp $$
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton SINGLETON;

    static {
        SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return SINGLETON;
    }
}