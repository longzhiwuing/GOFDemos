package com.lzw.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 9:49
 */
public class Decorator1 implements CommonMethods {

    CommonMethods wrapObj;

    public Decorator1(CommonMethods wrapObj) {
        this.wrapObj = wrapObj;
    }

    @Override
    public void show() {
        this.decMethod();
        wrapObj.show();
    }

    public void decMethod() {
        System.out.println("我是装饰器1decMethod 打印出来的，我在做修饰...");
    }
}
