package com.lzw.proxy;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:24
 */
public class TestProxy {
    @Test
    public void test() {
        RealObject realObject = new RealObject();
        ProxyObject proxyObject = new ProxyObject(realObject);

        proxyObject.request();
    }
}
