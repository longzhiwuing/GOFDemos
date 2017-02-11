package com.lzw.command;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/11
 * Time: 16:11
 */
public class TestCommand {

    @Test
    public void test(){
        Receiver receiver = new Receiver();

        Command commanda = new CommandA(receiver);

        Invoker invoker = new Invoker(commanda);

        invoker.executeCommond();

    }
}
