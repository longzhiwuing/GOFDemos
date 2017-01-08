package com.lzw.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 9:49
 */
public class Decorator2 implements CommonMethods {

    CommonMethods wrapObj;

    private String props = "Dec2's props...";

    public Decorator2(CommonMethods wrapObj) {
        this.wrapObj = wrapObj;
    }

    @Override
    public void show() {
        System.out.println("我是装饰器2，修饰...自身属性显示:" + props);
        wrapObj.show();
    }
}
