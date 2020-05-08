package com.yapt.demo.design.partterns.factory.simplefactory;


/**
 * 华为手机
 * @author hurui
 * @version Id: HuaWei.java, v 0.1 2020/2/3 16:54 YaphetS Exp $$
 */
public class HuaWeiCellphone implements Cellphone{


    @Override
    public void create() {
        System.out.println("获得华为手机一部");
    }
}