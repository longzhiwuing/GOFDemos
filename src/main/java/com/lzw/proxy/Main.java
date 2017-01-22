package com.lzw.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 9:42
 */
public class Main {

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        ProxyObject proxyObject = new ProxyObject(realObject);

        proxyObject.request();
    }
}
