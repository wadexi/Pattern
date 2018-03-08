package com.company.typecreatepattern.singlepattern;

/**
 * 饿汉式 单例模式
 */

public class Singleton3 {

    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3(){};


    public static Singleton3 getSingleton3() {

        return singleton3;
    }
}
