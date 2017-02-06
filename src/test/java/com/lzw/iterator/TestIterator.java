package com.lzw.iterator;

import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/7
 * Time: 0:20
 */
public class TestIterator {
    @Test
    public void test(){
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(new ArrayList<String>());

        concreteAggregate.arrs.add("张1");
        concreteAggregate.arrs.add("张2");
        concreteAggregate.arrs.add("张3");
        concreteAggregate.arrs.add("张4");
        concreteAggregate.arrs.add("张5");
        concreteAggregate.arrs.add("张6");
        concreteAggregate.arrs.add("张7");

        ConcreteIterator concreteIterator = new ConcreteIterator(concreteAggregate);

/*        Object fisrt = concreteIterator.fisrt();

        System.out.println("first:"+fisrt);*/

        while (!concreteIterator.isDone()) {
            System.out.println(concreteIterator.next());
        }

    }
}
