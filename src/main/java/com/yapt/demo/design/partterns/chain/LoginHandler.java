package com.yapt.demo.design.partterns.chain;

/**
 * @author hurui
 * @version Id: LoginHandler.java, v 0.1 2020/10/19 17:56 YaphetS Exp $$
 */
public class LoginHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        System.out.println("登录成功！！！");
        member.setRoleName("管理员");
        chain.doHandle(member);
    }
}