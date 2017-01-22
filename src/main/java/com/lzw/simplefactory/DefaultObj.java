package com.lzw.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 10:16
 */
public class DefaultObj implements CommonObj {

    @Override
    public void showType() {
        System.out.println("我是默认类型...");
    }
}
