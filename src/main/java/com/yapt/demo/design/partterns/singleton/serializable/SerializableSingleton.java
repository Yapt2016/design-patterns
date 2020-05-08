package com.yapt.demo.design.partterns.singleton.serializable;



/**
 * @author hurui
 * @version Id: SerializableSingleton.java, v 0.1 2020/2/5 14:33 YaphetS Exp $$
 */
public class SerializableSingleton {

    private static final SerializableSingleton SINGLETON = new SerializableSingleton();

    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        return SINGLETON;
    }

    /**
     * 重写readResolve方法，防止序列化和反序列化破坏单例
     *
     * @return
     */
    private Object readResolve(){
        return SINGLETON;
    }
}