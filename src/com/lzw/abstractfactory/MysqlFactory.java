package com.lzw.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/21
 * Time: 19:03
 */
public class MysqlFactory implements IFactory{

    @Override
    public IUser createUserFactory() {
        return new MysqlUser();
    }

    @Override
    public IDepart createDeptFactory() {
        return new MysqlDepart();
    }
}
