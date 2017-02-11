package com.lzw.command;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/11
 * Time: 15:56
 */
public class Command {

    Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    void execute(){
        receiver.doAction();
        System.out.println("处理receiver请求");;
    }
}
