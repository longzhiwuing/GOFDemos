package com.lzw.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 15:30
 */
public class Woman extends ManKind{
    public void accept(Action action) {
        action.getWomenAction(this);
    }

    @Override
    public String toString() {
        return "Woman{}";
    }
}
