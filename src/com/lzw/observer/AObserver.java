package com.lzw.observer;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/17
 * Time: 21:43
 */
public class AObserver implements Observer{

    private Subject subject;
    private String name;

    public AObserver(String name,Subject subject) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name+",获取到主题状态");
        subject.showState();
    }
}
