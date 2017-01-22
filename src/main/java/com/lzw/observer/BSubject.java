package com.lzw.observer;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/17
 * Time: 21:32
 */
public class BSubject extends Subject{

    private int subStateInt;

    public BSubject(int subStateInt) {
        this.subStateInt = subStateInt;
    }

    public int getSubStateInt() {
        return subStateInt;
    }

    public void setSubStateInt(int subStateInt) {
        this.subStateInt = subStateInt;
    }

    @Override
    void showState() {
        System.out.println("BSubject状态:"+subStateInt);
    }
}
