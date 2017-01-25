package com.lzw.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/25
 * Time: 22:54
 */
public class Composite extends Component{

    private String name;

    private List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = depth; i > 0; i--) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
        for (Component component : components) {
            component.display(depth+2);
        }
    }
}
