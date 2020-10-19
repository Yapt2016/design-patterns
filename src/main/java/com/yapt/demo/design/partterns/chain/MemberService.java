package com.yapt.demo.design.partterns.chain;

/**
 * @author hurui
 * @version Id: MemberService.java, v 0.1 2020/10/19 18:00 YaphetS Exp $$
 */
public class MemberService {

    public static void login(Member member) {

        Handler validHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validHandler.doHandle(member);
    }

    public static void main(String[] args) {
        Member member = new Member();
        member.setLoginNo("1");
        member.setLoginPwd("1");
        login(member);
    }
}