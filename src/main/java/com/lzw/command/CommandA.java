package com.lzw.command;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/11
 * Time: 15:58
 */
public class CommandA extends Command {

    public CommandA(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        System.out.println("commandA 正在执行...");
        super.execute();
    }
}
