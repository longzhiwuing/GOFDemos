package com.lzw.memento;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/24
 * Time: 9:25
 */
public class Original {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState() {
       return new Memento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }

    public void show() {
        System.out.println("state:"+state);
    }
}
