package com.lzw.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 13:59
 */
public class Mediator {

    ColleageA colleageA;
    ColleageB colleageB;

    public void sendmsg(String msg, Colleage colleage) {
        if (colleage instanceof ColleageA) {
            colleageB.getMsg(msg);
        }

        if (colleage instanceof ColleageB) {
            colleageA.getMsg(msg);
        }
    }
}
