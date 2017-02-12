package com.lzw.mediator;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 14:06
 */
public class TestMediator {

    @Test
    public void test() {
        Mediator mediator = new Mediator();

        Colleage colleagea = new ColleageA();

        Colleage colleageb = new ColleageB();

        mediator.colleageA = (ColleageA) colleagea;
        mediator.colleageB = (ColleageB) colleageb;

        ((ColleageA) colleagea).sendMsg("colleageb hello",mediator);

        ((ColleageB) colleageb).sendMsg("cola goodbye",mediator);




    }
}
