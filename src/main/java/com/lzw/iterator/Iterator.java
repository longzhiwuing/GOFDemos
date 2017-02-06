package com.lzw.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/7
 * Time: 0:00
 */
public abstract class Iterator {
    public abstract Object fisrt();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
