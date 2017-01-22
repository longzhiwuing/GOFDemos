package com.lzw.template;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:25
 */
public class TestTemplate {
    @Test
    public void test() {
        //制作的第一个模板
        Template concrete1 = new Concrete1();
        concrete1.mainWork();

        //制作的第二个模板
        Template concrete2 = new Concrete2();
        concrete2.mainWork();
    }
}
