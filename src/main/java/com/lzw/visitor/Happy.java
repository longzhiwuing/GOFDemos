package com.lzw.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 15:31
 */
public class Happy extends Action{
    public void getMenAction(Man man) {
        System.out.println(man+":Hahaha...");
    }

    public void getWomenAction(Woman woman) {
        System.out.println(woman+":HeHeHe...");
    }
}
