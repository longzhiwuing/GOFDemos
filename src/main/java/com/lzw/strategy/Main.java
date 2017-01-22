package com.lzw.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 10:08
 */
public class Main {

    public static void main(String[] args) {

        Strategy strategy1 = new Strategy1();

        Strategy strategy2 = new Strategy2();

        Context ctx = new Context(strategy1);

        ctx.doStrategy();

        ctx = new Context(strategy2);

        ctx.doStrategy();


    }
}
