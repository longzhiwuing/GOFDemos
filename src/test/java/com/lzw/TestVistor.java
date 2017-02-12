package com.lzw;

import com.lzw.visitor.*;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/12
 * Time: 15:34
 */
public class TestVistor {

    @Test
    public void test() {
        ObjectStucture o = new ObjectStucture();

        o.attach(new Man());
        o.attach(new Woman());


        Action happy = new Happy();

        o.display(happy);

        Action sad = new Sad();

        o.display(sad);


    }
}
