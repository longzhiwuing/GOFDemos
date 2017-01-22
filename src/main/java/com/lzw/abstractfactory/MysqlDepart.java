package com.lzw.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/21
 * Time: 19:01
 */
public class MysqlDepart implements IDepart{
    @Override
    public void createDept() {
        System.out.println("mysql create a dept");
    }

    @Override
    public void getDept() {
        System.out.println("mysql get a dept");
    }
}
