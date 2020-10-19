package com.yapt.demo.design.partterns.chain;

import org.apache.commons.lang3.StringUtils;

/**
 * @author hurui
 * @version Id: ValidateHandler.java, v 0.1 2020/10/19 17:51 YaphetS Exp $$
 */
public class ValidateHandler extends Handler {


    @Override
    public void doHandle(Member member) {
        if (StringUtils.isEmpty(member.getLoginNo()) || StringUtils.isEmpty(member.getLoginPwd())) {
            System.out.println("登录号或者密码不能为空！！！");
            return;
        }
        System.out.println("登录号和密码校验成功！！！");
        chain.doHandle(member);
    }
}