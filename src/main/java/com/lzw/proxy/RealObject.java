package com.lzw.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 9:40
 */
public class RealObject extends CommonMethods {
    @Override
    public void request() {
        System.out.println("我是真实对象产生的 request");
    }
}
