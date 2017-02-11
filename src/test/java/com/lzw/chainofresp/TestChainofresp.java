package com.lzw.chainofresp;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/11
 * Time: 16:33
 */
public class TestChainofresp {

    @Test
    public void test() {
        Handler handlera = new HandlerA();
        Handler handlerb = new HandlerB();
        Handler handlerc = new HandlerC();

        handlera.setHandler(handlerb);
        handlerb.setHandler(handlerc);

        handlera.handleRequest(0);
        handlera.handleRequest(5);
        handlera.handleRequest(50);
    }
}
