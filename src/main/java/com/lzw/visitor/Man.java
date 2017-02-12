package com.lzw.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 15:24
 */
public class Man extends ManKind {

    public void accept(Action action) {
        action.getMenAction(this);
    }

    @Override
    public String toString() {
        return "Man{}";
    }
}
