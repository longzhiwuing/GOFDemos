package com.lzw.component;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/25
 * Time: 22:45
 */
public class Leaf extends Component{

    private String name;

    public Leaf(String name) {
        super(name);
        this.name = name;
    }

    public void add(Component component) {
        System.out.println("leaf node cannot add");
    }

    public void remove(Component component) {
        System.out.println("leaf node cannot remove");
    }

    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = depth; i > 0; i--) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }
}
