package com.lzw.template;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/14
 * Time: 22:12
 */
public class Main {
    public static void main(String[] args) {
        //制作的第一个模板
        Template concrete1 = new Concrete1();
        concrete1.mainWork();

        //制作的第二个模板
        Template concrete2 = new Concrete2();
        concrete2.mainWork();
    }
}
