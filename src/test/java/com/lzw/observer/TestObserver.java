package com.lzw.observer;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:23
 */
public class TestObserver {
    @Test
    public void test() {
        Subject sub1 = new ASubject("str---state");

        Observer aobserver = new AObserver("aobserver",sub1);

        Observer bobserver = new BObserver("bobserver", sub1);

        sub1.attach(aobserver);
//        sub1.attach(bobserver);

        sub1.notifyUpdate();

        Subject sub2 = new BSubject(1);

        aobserver = new AObserver("aobserver",sub2);

        bobserver = new BObserver("bobserver", sub2);

//        sub2.attach(aobserver);
        sub2.attach(bobserver);

        sub2.notifyUpdate();
    }
}
