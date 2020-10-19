package com.yapt.demo.design.partterns.chain;

/**
 * @author hurui
 * @version Id: AuthHandler.java, v 0.1 2020/10/19 17:58 YaphetS Exp $$
 */
public class AuthHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有权限操作！！！");
            return;
        }
        System.out.println("您是管理员，可以操作！！！");
    }
}