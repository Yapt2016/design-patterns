package com.yapt.demo.design.partterns.factory.abstractfactory;


/**
 * 电子产品工厂
 * @author hurui
 * @version Id: ElectronicProductsFactory.java, v 0.1 2020/2/3 17:19 YaphetS Exp $$
 */
public interface ElectronicProductsFactory {

    /**
     * 生产手机
     * @return
     */
    Cellphone createCellPhone();

    /**
     * 生产电视
     * @return
     */
    Television createTelevision();
}