package com.lzw.abstractfactory;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/22
 * Time: 18:14
 */
public class TestAbstractfactory {

    @Test
    public void test() {
        //根据情况更换工厂，感觉不是很实用，如果要增加产品，需要改动3个文件。。
//        IFactory factory = new OracleFactory();
        MysqlFactory factory = new MysqlFactory();
        IUser userFactory = factory.createUserFactory();
        IDepart deptFactory = factory.createDeptFactory();

        userFactory.CreateUser();

        deptFactory.createDept();
    }
}
