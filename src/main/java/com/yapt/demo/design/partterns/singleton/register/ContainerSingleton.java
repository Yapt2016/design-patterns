package com.yapt.demo.design.partterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hurui
 * @version Id: ContainerSingleton.java, v 0.1 2020/2/5 15:35 YaphetS Exp $$
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className){

        if(!ioc.containsKey(className)){
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }
        return ioc.get(className);
    }
}