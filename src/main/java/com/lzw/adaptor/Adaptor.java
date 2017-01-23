package com.lzw.adaptor;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/23
 * Time: 10:29
 */
public class Adaptor extends Target{

    Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specialRequest();
    }
}
