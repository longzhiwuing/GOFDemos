package com.lzw.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 13:59
 */
public class ColleageA extends Colleage{

    public void sendMsg(String msg, Mediator mediator) {
        mediator.sendmsg(msg, this);
    }

    public void getMsg(String msg) {
        System.out.println("ColleageA get a msg:"+msg);
    }
}
