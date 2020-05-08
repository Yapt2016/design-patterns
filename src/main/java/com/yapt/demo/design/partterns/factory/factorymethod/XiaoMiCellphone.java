package com.yapt.demo.design.partterns.factory.factorymethod;

/**
 * 小米手机
 * @author hurui
 * @version Id: XiaoMi.java, v 0.1 2020/2/3 16:54 YaphetS Exp $$
 */
public class XiaoMiCellphone implements Cellphone {

    @Override
    public void create() {
        System.out.println("获得小米手机一部");
    }
}