package com.lzw.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 15:33
 */
public class Sad extends Action{
    public void getMenAction(Man man) {
        System.out.println(man+":not crying...");
    }

    public void getWomenAction(Woman woman) {
        System.out.println(woman+":55555555");
    }
}
