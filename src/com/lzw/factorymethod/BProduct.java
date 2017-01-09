package com.lzw.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/9
 * Time: 22:07
 */
public class BProduct implements IProduct{
    @Override
    public void showName() {
        System.out.println("Bproduct...");
    }
}
