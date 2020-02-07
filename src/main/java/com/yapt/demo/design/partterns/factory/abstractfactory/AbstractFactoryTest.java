package com.yapt.demo.design.partterns.factory.abstractfactory;

/**
 * @author hurui
 * @version Id: AbstractFactoryTest.java, v 0.1 2020/2/3 17:26 YaphetS Exp $$
 */
public class AbstractFactoryTest {

    /**
     * 抽象工厂模式
     * 适用场景：强调一系列相关产品对象（属于同一产品族）一起适用创建对象需要大量重复代码
     * 优点：将一系列的产品族统一到一起创建
     * 缺点：产品族中扩展新的产品困难，不符合开闭原则
     * 典型的类有：DefaultListableBeanFactory
     * @param args
     */
    public static void main(String[] args) {
        ElectronicProductsFactory electronicProductsFactory = new XiaoMiFactory();
        electronicProductsFactory.createCellPhone().create();
        electronicProductsFactory.createTelevision().create();
    }
}