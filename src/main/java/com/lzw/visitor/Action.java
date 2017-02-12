package com.lzw.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 15:23
 */
public abstract class Action {

    public abstract void getMenAction(Man man);

    public abstract void getWomenAction(Woman woman);
}
