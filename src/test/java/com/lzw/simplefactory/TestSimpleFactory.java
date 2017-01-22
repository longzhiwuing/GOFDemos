package com.lzw.simplefactory;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:25
 */
public class TestSimpleFactory {
    @Test
    public void test() {
        CommonObj commonObj = SimpleFactory.createObj("com.lzw.simplefactory.TypeObj1");
        commonObj.showType();
        commonObj = SimpleFactory.createObj("com.lzw.simplefactory.TypeObj2");
        commonObj.showType();
        commonObj = SimpleFactory.createObj("com.lzw.simplefactory.DefaultObj");
        commonObj.showType();
    }
}
