package com.lzw.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/10
 * Time: 14:01
 */
public class BridgeClient {

    private AbstractImplementor abstractImplementor;

    public void setAbstractImplementor(AbstractImplementor abstractImplementor) {
        this.abstractImplementor = abstractImplementor;
    }

    public void doOperate(){
        abstractImplementor.operate();
    }
}
