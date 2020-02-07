package com.yapt.demo.design.partterns.singleton.lazy;

/**
 * 懒汉式之双重检验锁实现
 * @author hurui
 * @version Id: LazyDubboCheckSingleton.java, v 0.1 2020/2/4 20:38 YaphetS Exp $$
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton SINGLETON = null;

    private LazyDoubleCheckSingleton(){

    }

//    /**
//     * jdk1.6之后对synchronized优化了不少
//     * 但还是不可避免的存在一定得性能问题
//     * @return
//     */
//    public synchronized static LazySimpleSingleton getInstance(){
//        if(SINGLETON == null){
//            SINGLETON =  new LazySimpleSingleton();
//        }
//        return SINGLETON;
//    }


    /**
     * 适中方案
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if(SINGLETON == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(SINGLETON == null){
                    SINGLETON =  new LazyDoubleCheckSingleton();
                    //cup执行时会转换成jvm指令执行
                    //指令重排序的问题可以用volatile解决
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关联，赋值
                    //4.用户初次访问
                }
            }
        }
        return SINGLETON;
    }


}