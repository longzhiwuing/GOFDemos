package com.lzw.state;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 17:18
 */
public class StateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("StateB to StateA");
        context.setState(new StateA());
    }
}
