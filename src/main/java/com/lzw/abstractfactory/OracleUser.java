package com.lzw.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/21
 * Time: 18:59
 */
public class OracleUser implements IUser{
    @Override
    public void CreateUser() {
        System.out.println("oracle create a user");
    }

    @Override
    public void getUser() {
        System.out.println("oracle get a user");
    }
}
