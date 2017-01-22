package com.lzw.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 10:21
 */
public class Main {

    public static void main(String[] args) {
        CommonObj commonObj = SimpleFactory.createObj("com.lzw.simplefactory.TypeObj1");
        commonObj.showType();
        commonObj = SimpleFactory.createObj("com.lzw.simplefactory.TypeObj2");
        commonObj.showType();
        commonObj = SimpleFactory.createObj("com.lzw.simplefactory.DefaultObj");
        commonObj.showType();
    }
}
