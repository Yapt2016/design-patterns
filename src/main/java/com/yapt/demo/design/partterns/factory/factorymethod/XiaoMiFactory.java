package com.yapt.demo.design.partterns.factory.factorymethod;

/**
 * @author hurui
 * @version Id: XiaoMiFactory.java, v 0.1 2020/2/3 21:03 YaphetS Exp $$
 */
public class XiaoMiFactory implements CellPhoneFactory{

    public Cellphone createCellphone() {
        return new XiaoMiCellphone();
    }
}