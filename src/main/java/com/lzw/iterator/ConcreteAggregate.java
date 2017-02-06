package com.lzw.iterator;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/7
 * Time: 0:02
 */
public class ConcreteAggregate extends Aggregate{

    public List<String> arrs;

    public ConcreteAggregate(List<String> arrs) {
        this.arrs = arrs;
    }

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
