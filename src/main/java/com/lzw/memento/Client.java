package com.lzw.memento;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/24
 * Time: 9:27
 */
public class Client {

    public static void doTest() {
        Original original = new Original();
        original.setState("ON");

        //初始状态为ON
        original.show();

        Memento memento = original.saveState();

        //修改状态为OFF
        original.setState("OFF");

        original.show();

        //回复状态为初始状态
        original.restore(memento);

        original.show();
    }

}
