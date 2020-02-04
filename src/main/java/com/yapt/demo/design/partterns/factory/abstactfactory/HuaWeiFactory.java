package com.yapt.demo.design.partterns.factory.abstactfactory;

/**
 * 华为电子产品工厂
 * @author hurui
 * @version Id: HuaWeiFactory.java, v 0.1 2020/2/3 17:22 YaphetS Exp $$
 */
public class HuaWeiFactory implements ElectronicProductsFactory{

    /**
     * 生产华为手机
     * @return
     */
    public Cellphone createCellPhone() {
        return new HuaWeiCellphone();
    }

    /**
     * 生产华为电视
     * @return
     */
    public Television createTelevision() {
        return new HuaWeiTelevision();
    }
}