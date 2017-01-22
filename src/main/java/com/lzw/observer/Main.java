package com.lzw.observer;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/17
 * Time: 22:00
 */
public class Main {

    /**
     * 比较粗糙的实现，耦合度很高。由于java没有现成的委托机制，以后自己实现委托机制在实现一个版本
     * @param args
     */
    public static void main(String[] args) {
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
