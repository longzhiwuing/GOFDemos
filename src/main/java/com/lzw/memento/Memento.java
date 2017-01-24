package com.lzw.memento;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/24
 * Time: 9:26
 */
public class Memento {
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
