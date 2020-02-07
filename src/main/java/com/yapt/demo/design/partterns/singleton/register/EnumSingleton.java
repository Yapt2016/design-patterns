package com.yapt.demo.design.partterns.singleton.register;

/**
 * @author hurui
 * @version Id: EnumSingleton.java, v 0.1 2020/2/5 15:12 YaphetS Exp $$
 */
public enum  EnumSingleton {
    /**
     *
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}