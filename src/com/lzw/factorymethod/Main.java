package com.lzw.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/9
 * Time: 22:08
 */
public class Main {
    public static void main(String[] args) throws Exception {

        String packagename = "com.lzw.factorymethod.";

        String classname =   Math.random()>0.5?"AProductFactory":"BProductFactory";

        IFactory iFactory = (IFactory) Class.forName(packagename + classname).newInstance();

        iFactory.createProduct().showName();

    }
}
