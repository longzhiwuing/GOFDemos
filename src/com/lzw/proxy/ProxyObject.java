package com.lzw.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 9:41
 */
public class ProxyObject extends CommonMethods {

    RealObject realObject;

    public ProxyObject(RealObject realObject) {
        this.realObject = realObject;
    }

    @Override
    public void request() {
        System.out.println("我是代理对象的request...");
        realObject.request();
    }
}
