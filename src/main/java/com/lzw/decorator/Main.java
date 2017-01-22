package com.lzw.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 9:51
 */
public class Main {

    public static void main(String[] args) {
        CommonMethods subject = new Subject();

        CommonMethods dec2 = new Decorator2(subject);

        CommonMethods dec1 = new Decorator1(dec2);


        dec1.show();

//        dec2.show();
    }
}
