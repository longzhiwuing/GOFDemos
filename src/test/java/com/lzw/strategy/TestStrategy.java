package com.lzw.strategy;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:25
 */
public class TestStrategy {
    @Test
    public void test() {
        Strategy strategy1 = new Strategy1();

        Strategy strategy2 = new Strategy2();

        Context ctx = new Context(strategy1);

        ctx.doStrategy();

        ctx = new Context(strategy2);

        ctx.doStrategy();
    }
}
