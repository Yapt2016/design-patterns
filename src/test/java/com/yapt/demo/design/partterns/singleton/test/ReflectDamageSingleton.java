package com.yapt.demo.design.partterns.singleton.test;

import com.yapt.demo.design.partterns.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author hurui
 * @version Id: reflectDamageSingleton.java, v 0.1 2020/6/24 11:20 YaphetS Exp $$
 */
public class ReflectDamageSingleton {

    public static void main(String[] args) {
        try {
            //获取类型
            Class<?> clazz = LazyInnerClassSingleton.class;

            //通过反射获取所有的私有构造方法
            Constructor<?> constructor = clazz.getDeclaredConstructor();

            //强制访问
            constructor.setAccessible(true);

            //调用两次构造方法相当于new了两次
            Object o1 = constructor.newInstance();

            Object o2 = constructor.newInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}