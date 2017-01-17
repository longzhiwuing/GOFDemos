package com.lzw.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/17
 * Time: 21:26
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyUpdate(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    abstract void showState();

}
