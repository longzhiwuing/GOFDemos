package com.lzw.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 15:25
 */
public class ObjectStucture {

    List<ManKind> manKinds = new ArrayList<ManKind>();

    public void attach(ManKind manKind) {
        manKinds.add(manKind);
    }

    public void dettach(ManKind manKind) {
        manKinds.remove(manKind);
    }

    public void display(Action action) {
        for (ManKind manKind : manKinds) {
            manKind.accept(action);
        }
    }
}
