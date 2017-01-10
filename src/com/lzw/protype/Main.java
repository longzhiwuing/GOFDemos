package com.lzw.protype;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/10
 * Time: 20:41
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        CloneObject obj1 = new CloneObject(1,"type1",new Date(),new CloneType("cloneType1"));
        CloneObject obj2 = obj1.clone();

        System.out.println(obj1);
        System.out.println(obj2);

        //克隆对象,hash值不同，对象不同，但属性值相同
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));


        //做深拷贝，拷贝对象里的子对象。只有深拷贝之后，子对象属性值相同，但hash不同，表示不同的对象，互不影响
        //如果是深拷贝，该判断应该是false，浅拷贝为true
        System.out.println(obj1.getCloneType()==obj2.getCloneType());
        System.out.println(obj1.getCloneType().equals(obj2.getCloneType()));

    }
}
