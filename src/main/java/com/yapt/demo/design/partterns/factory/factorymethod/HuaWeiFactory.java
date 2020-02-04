package com.yapt.demo.design.partterns.factory.factorymethod;

/**
 * @author hurui
 * @version Id: HuaWeiFactory.java, v 0.1 2020/2/3 21:04 YaphetS Exp $$
 */
public class HuaWeiFactory implements CellPhoneFactory{

    public Cellphone createCellphone() {
        return new HuaWeiCellphone();
    }
}