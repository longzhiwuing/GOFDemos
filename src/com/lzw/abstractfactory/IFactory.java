package com.lzw.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/21
 * Time: 19:02
 */
public interface IFactory {
    IUser createUserFactory();
    IDepart createDeptFactory();
}
