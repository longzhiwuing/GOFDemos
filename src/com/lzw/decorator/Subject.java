package com.lzw.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 9:48
 */
public class Subject implements CommonMethods {

    @Override
    public void show() {
        System.out.println("我是主体内容...");
    }
}
