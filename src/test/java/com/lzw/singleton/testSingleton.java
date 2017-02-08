package com.lzw.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/8
 * Time: 23:02
 */
public class testSingleton {

    @Test
    public void test() {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        Assert.assertEquals(singleton1,singleton2);
    }
}
