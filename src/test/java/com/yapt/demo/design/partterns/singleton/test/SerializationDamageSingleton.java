package com.yapt.demo.design.partterns.singleton.test;

import com.yapt.demo.design.partterns.singleton.lazy.LazyInnerClassSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化破坏单例
 * 一个对象创建好之后，有时候需要将对象序列化然后存入磁盘，下次使用时再从磁盘中读取对象并进行反序列化，将其转化为内存对象
 * 反序列化之后的对象会重新分配内存,即重新创建。如果序列化的对象为单例对象，就会违背单例的初衷，相当于破坏了单例
 *
 * @author hurui
 * @version Id: SerializationDamageSingleton.java, v 0.1 2020/6/24 11:31 YaphetS Exp $$
 */
public class SerializationDamageSingleton {

    public static void main(String[] args) {
        try {
            //Write Obj to file
            FileOutputStream fos = new FileOutputStream("LazyInnerClassSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(LazyInnerClassSingleton.getInstance());
            oos.flush();
            oos.close();

            //Read Obj from file
            FileInputStream fis = new FileInputStream("LazyInnerClassSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            LazyInnerClassSingleton singleton = (LazyInnerClassSingleton) ois.readObject();
            ois.close();

            LazyInnerClassSingleton newSingleton = LazyInnerClassSingleton.getInstance();

            System.out.println(singleton == newSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}