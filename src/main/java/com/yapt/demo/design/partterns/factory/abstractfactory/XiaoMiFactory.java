package com.yapt.demo.design.partterns.factory.abstractfactory;

/**
 * 小米电子产品工厂
 * @author hurui
 * @version Id: XiaoMiFactory.java, v 0.1 2020/2/3 17:22 YaphetS Exp $$
 */
public class XiaoMiFactory implements ElectronicProductsFactory{

    /**
     * 生产小米手机
     * @return
     */
    @Override
    public Cellphone createCellPhone() {
        return new XiaoMiCellphone();
    }

    /**
     * 生产小米电视
     * @return
     */
    @Override
    public Television createTelevision() {
        return new XiaoMiTelevision();
    }
}