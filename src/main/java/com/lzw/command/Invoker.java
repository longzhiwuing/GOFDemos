package com.lzw.command;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/11
 * Time: 16:01
 */
public class Invoker {

    Command commond;

    public Invoker(Command commond) {
        this.commond = commond;
    }

    public void executeCommond() {
        commond.execute();
    }
}
