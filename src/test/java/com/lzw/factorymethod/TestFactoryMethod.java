package com.lzw.factorymethod;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:23
 */
public class TestFactoryMethod {
    @Test
    public void test() throws Exception {
        String packagename = "com.lzw.factorymethod.";

        String classname =   Math.random()>0.5?"AProductFactory":"BProductFactory";

        IFactory iFactory = (IFactory) Class.forName(packagename + classname).newInstance();

        iFactory.createProduct().showName();
    }
}
