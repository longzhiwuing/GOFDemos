package com.lzw.template;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/14
 * Time: 22:10
 */
public class Concrete1 extends Template{
    @Override
    protected void diffWork2() {
        System.out.println("concrete1实现的方法2");
    }

    @Override
    protected void diffWork1() {
        System.out.println("conrete1实现的方法1");
    }
}
