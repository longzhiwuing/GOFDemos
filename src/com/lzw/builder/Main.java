package com.lzw.builder;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/15
 * Time: 10:33
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 通过Config的例子抽象一个构建者模式
         *
         * 思路:
         * 1、需要构造的类中新增Builder静态类并赋默认值
         * 2、为每一个属性创建返回自身Builder对象的方法
         * 3、新建一个aplly方法，传一个父类引用，赋值构建的参数
         * 4、新建一个build方法，创建一个父类对象，传递给apply方法为这个空对象赋构建出来的参数值，返回这个构建对象即可。
         */

        //默认不构造参数
        Config config1 = new Config.Builder().build();

        System.out.println(config1);

        //构造参数
        Config config = new Config.Builder()
                .setProtocol("https://")
                .setIp("192.168.0.1.")
                .setPort("8080")
                .build();

        System.out.println(config);
    }
}
