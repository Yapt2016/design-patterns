package com.yapt.demo.design.partterns.chain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hurui
 * @version Id: Member.java, v 0.1 2020/10/19 17:44 YaphetS Exp $$
 */
@Data
public class Member implements Serializable {

    private String loginNo;

    private String loginPwd;

    private String roleName;
}