package com.lzw.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/7
 * Time: 0:05
 */
public class ConcreteIterator extends Iterator{

    ConcreteAggregate aggregate;
    int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Object fisrt() {
        return aggregate.arrs.get(0);
    }

    public Object next() {
        return aggregate.arrs.get(current++);
    }

    public boolean isDone() {
        return current>=aggregate.arrs.size();
    }

    public Object currentItem() {
        return aggregate.arrs.get(current);
    }
}
