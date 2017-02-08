package com.lzw.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/2/8
 * Time: 23:02
 */
public class Singleton {

    /**
     * 懒汉式
     */

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    /*
     *IDEA默认生成饿汉式
     */

    /*private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }*/


}
