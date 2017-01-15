package com.lzw.facade;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/15
 * Time: 9:43
 */
public class Facade {

    SubSys1 subSys1;
    SubSys2 subSys2;

    public Facade() {
        this.subSys1 = new SubSys1();
        this.subSys2 = new SubSys2();
    }

    public void method1() {
        System.out.println("统一调用方法1...");
        subSys1.method1();
        subSys2.method1();
    }

    public void method2() {
        System.out.println("统一调用方法2...");
        subSys1.method2();
        subSys2.method2();
    }
}
