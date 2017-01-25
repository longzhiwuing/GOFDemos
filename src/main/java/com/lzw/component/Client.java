package com.lzw.component;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/25
 * Time: 22:57
 */
public class Client {

    public static void doTest() {
        Composite root = new Composite("root");
        root.add(new Leaf("leafA"));
        root.add(new Leaf("leafB"));


        Composite composite = new Composite("COMA");
        composite.add(new Leaf("COMA-Leaf1"));
        composite.add(new Leaf("COMA-Leaf2"));

        root.add(composite);

        Composite composite1 = new Composite("COMB");
        composite1.add(new Leaf("COMB-Leaf1"));
        composite1.add(new Leaf("COMB-Leaf2"));

        root.add(composite1);

        root.display(1);

        System.out.println("------------------------------------------");

        root.remove(composite1);

        root.display(1);

    }
}
