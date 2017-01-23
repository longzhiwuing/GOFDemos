package com.lzw.adaptor;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/23
 * Time: 10:31
 */
public class Client {

    public void doRequest(Target target) {
        System.out.println("客户端调用");
        target.request();
    }
}
