package com.yapt.demo.design.partterns.proxy.dynamicproxy.jdkproxy;


import com.yapt.demo.design.partterns.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class Girl implements Person {
    @Override
    public void findLove(String name) {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
