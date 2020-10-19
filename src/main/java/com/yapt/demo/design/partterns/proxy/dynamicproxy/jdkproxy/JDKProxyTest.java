package com.yapt.demo.design.partterns.proxy.dynamicproxy.jdkproxy;


import com.yapt.demo.design.partterns.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            Person obj = new JDKMeipo().getInstance(new Girl());
            obj.findLove("");

            //$Proxy0
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
