package com.lzw.bridge;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/10
 * Time: 14:09
 */
public class TestBridge {

    @Test
    public void test(){
        BridgeClient bc = new BridgeClient();
        bc.setAbstractImplementor(new ImplementorA());
        bc.doOperate();

        bc.setAbstractImplementor(new ImplementorB());
        bc.doOperate();
    }
}
