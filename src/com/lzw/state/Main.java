package com.lzw.state;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 17:18
 */
public class Main {
    public static void main(String[] args) {

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
