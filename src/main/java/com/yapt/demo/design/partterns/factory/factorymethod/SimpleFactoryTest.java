package com.yapt.demo.design.partterns.factory.factorymethod;


/**
 * 工厂方法模式测试
 * @author hurui
 * @version Id: simpleFactoryTest.java, v 0.1 2020/2/3 15:20 YaphetS Exp $$
 */
public class SimpleFactoryTest {

    /**
     *工厂方法模式
     *适用场景：创建对象需要大量重复的代码，一个类通过其子类来指定创建那个对象
     * 优点：只需关心产品对应的工厂，符合开闭原则，提高了可扩展性
     * 缺点: 类的个数容易过多，增加了代码的复杂结构，增加了系统的抽象性和理解难度
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        CellPhoneFactory cellPhoneFactory = new XiaoMiFactory();
        Cellphone cellphone = cellPhoneFactory.createCellphone();
        cellphone.create();
    }
}