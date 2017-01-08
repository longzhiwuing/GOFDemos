package com.lzw.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/8
 * Time: 10:17
 */
public class SimpleFactory {

    public static CommonObj createObj(String type) {
        CommonObj commonObj;
        try {
            Class clazz = Class.forName(type);
            commonObj = (CommonObj) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            commonObj = new DefaultObj();
        }

        return commonObj;
    }
}
