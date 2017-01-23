package com.lzw.adaptor;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/23
 * Time: 10:32
 */
public class TestAdaptor {

    @Test
    public void test() {

        //创建适配对象，适配需要适配的对象
        Target target = new Adaptor(new Adaptee());

        Client client = new Client();

        //客户端调用目标方法
        client.doRequest(target);

    }
}
