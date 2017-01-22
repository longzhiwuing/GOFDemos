package com.lzw.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/9
 * Time: 22:06
 */
public class AProductFactory implements IFactory{
    @Override
    public IProduct createProduct() {
        return new AProduct();
    }
}
