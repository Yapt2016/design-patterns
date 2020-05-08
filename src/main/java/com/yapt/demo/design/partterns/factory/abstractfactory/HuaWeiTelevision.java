package com.yapt.demo.design.partterns.factory.abstractfactory;


/**
 * 华为电视
 * @author hurui
 * @version Id: HuaWeiTelevision.java, v 0.1 2020/2/3 17:31 YaphetS Exp $$
 */
public class HuaWeiTelevision implements Television{

    @Override
    public void create() {
        System.out.println("获得华为电视机一台");
    }
}