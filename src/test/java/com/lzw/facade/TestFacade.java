package com.lzw.facade;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:22
 */
public class TestFacade {
    @Test
    public void test() {
        //我理解外观模式就是很简单的一种封装模式，把复杂的子系统通过抽象一个业务类来进行封装调用
        Facade facade = new Facade();
        facade.method1();
        facade.method2();
    }
}
