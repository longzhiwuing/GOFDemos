package com.lzw.decorator;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:21
 */
public class TestDecorator {

    @Test
    public void test() {
        CommonMethods subject = new Subject();

        CommonMethods dec2 = new Decorator2(subject);

        CommonMethods dec1 = new Decorator1(dec2);


        dec1.show();

//        dec2.show();
    }
}
