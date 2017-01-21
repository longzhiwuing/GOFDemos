package com.lzw.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/21
 * Time: 18:59
 */
public class MysqlUser implements IUser{
    @Override
    public void CreateUser() {
        System.out.println("mysql create a user");
    }

    @Override
    public void getUser() {
        System.out.println("mysql get a user");
    }
}
