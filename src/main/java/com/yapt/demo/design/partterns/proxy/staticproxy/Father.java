package com.yapt.demo.design.partterns.proxy.staticproxy;


import com.yapt.demo.design.partterns.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class Father implements Person {
    private Son person;

    public Father(Son person) {
        this.person = person;
    }

    @Override
    public void findLove(String name) {
        System.out.println("父亲物色对象");
        this.person.findLove(name);
        System.out.println("双方父母同意，确立关系");
    }

    public void findJob() {

    }


}
