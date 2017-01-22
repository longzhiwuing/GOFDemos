package com.lzw.state;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 17:17
 */
public class StateA extends State{
    @Override
    public void handle(Context context) {
        System.out.println("StateA to StateB");
        context.setState(new StateB());
    }
}
