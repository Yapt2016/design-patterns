package com.yapt.demo.design.partterns.chain;

/**
 * @author hurui
 * @version Id: Handler.java, v 0.1 2020/10/19 17:48 YaphetS Exp $$
 */
public abstract class Handler {

    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandle(Member member);
}