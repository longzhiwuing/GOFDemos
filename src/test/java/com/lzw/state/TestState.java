package com.lzw.state;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:25
 */
public class TestState {
    @Test
    public void test() {
        //不断变换状态，根据状态不同，操作内容不同
        Context context = new Context();
        context.setState(new StateA());
        //一直请求下去,会一直在A,B状态间切换，输出
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
