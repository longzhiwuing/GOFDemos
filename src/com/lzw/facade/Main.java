package com.lzw.facade;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/15
 * Time: 9:46
 */
public class Main {

    public static void main(String[] args) {
        //我理解外观模式就是很简单的一种封装模式，把复杂的子系统通过抽象一个业务类来进行封装调用
        Facade facade = new Facade();
        facade.method1();
        facade.method2();
    }
}
