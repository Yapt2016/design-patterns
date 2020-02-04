package com.yapt.demo.design.partterns.factory.simplefactory;


/**
 * @author hurui
 * @version Id: CellphoneFactory.java, v 0.1 2020/2/3 16:56 YaphetS Exp $$
 */
public class CellphoneFactory {



    public Cellphone createCellphone1(String name){
        if("xiaomi".equals(name)){
            return new XiaoMiCellphone();
        }else if("huawei".equals(name)){
            return new HuaWeiCellphone();
        }else{
            return null;
        }
    }

    public Cellphone createCellphone2(String className){
        try {
            if (className != null && !"".equals(className)){
                return (Cellphone)Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public Cellphone createCellphone3(Class clazz){
        try {
            if (clazz != null){
                return (Cellphone) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}