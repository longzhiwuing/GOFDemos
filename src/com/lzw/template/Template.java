package com.lzw.template;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/14
 * Time: 22:06
 */
public abstract class Template {

    public void commonWorks(){
        System.out.println("大家都需要实现的功能或方法...");
    }

    public void mainWork(){
        System.out.println("start working...");
        commonWorks();
        diffWork1();
        diffWork2();
        System.out.println("end working...");
    }

    protected abstract void diffWork2();

    protected abstract void diffWork1();
}
