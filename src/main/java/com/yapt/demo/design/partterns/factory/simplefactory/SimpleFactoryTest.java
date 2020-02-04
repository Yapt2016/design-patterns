package com.yapt.demo.design.partterns.factory.simplefactory;


import java.util.Calendar;

/**
 * 简单工厂模式测试
 * @author hurui
 * @version Id: simpleFactoryTest.java, v 0.1 2020/2/3 15:20 YaphetS Exp $$
 */
public class SimpleFactoryTest {

    /**
     * 简单工厂模式
     * 适用场景：工厂类负责创建的对象较少，客户端只需要传入工厂类的参数，对如何创建对象的逻辑不需要关心
     * 优点：只需要传入一个正确的参数就可以获取你想要的对象
     * 缺点：工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断，违背开闭原则，不易于扩展
     * 典型的类有Calendar.getInstance(),LoggerFactory.getLogger()
     *
     * @param args
     */
    public static void main(String[] args) {
        Calendar.getInstance();
        CellphoneFactory cellphoneFactory = new CellphoneFactory();
        Cellphone cellphone1 = cellphoneFactory.createCellphone1("xiaomi");
        cellphone1.create();

        Cellphone cellphone2 = cellphoneFactory.createCellphone2("com.yapt.demo.design.partterns.factory.simplefactory.HuaWeiCellphone");
        cellphone2.create();

        Cellphone cellphone3 = cellphoneFactory.createCellphone3(HuaWeiCellphone.class);
        cellphone3.create();
    }
}