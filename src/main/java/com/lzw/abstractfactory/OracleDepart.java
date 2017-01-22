package com.lzw.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/21
 * Time: 19:01
 */
public class OracleDepart implements IDepart{
    @Override
    public void createDept() {
        System.out.println("oracle create a dept");
    }

    @Override
    public void getDept() {
        System.out.println("oracle get a dept");
    }
}
