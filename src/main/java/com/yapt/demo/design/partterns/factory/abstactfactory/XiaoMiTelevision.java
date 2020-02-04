package com.yapt.demo.design.partterns.factory.abstactfactory;


/**
 * 小米电视
 * @author hurui
 * @version Id: XiaoMiTelevision.java, v 0.1 2020/2/3 17:30 YaphetS Exp $$
 */
public class XiaoMiTelevision implements Television{
    public void create() {
        System.out.println("获得小米电视一台");
    }
}