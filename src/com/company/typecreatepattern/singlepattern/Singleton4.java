package com.company.typecreatepattern.singlepattern;

/**
 * 登记式/静态内部类
 * 这种方式是 Singleton 类被装载了，instance 不一定被初始化
 * 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance
 */
public class Singleton4 {

//    private static Singleton4 singleton4;

    private Singleton4(){};



    private static class SingleHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static final Singleton4 getInstance(){
        return SingleHolder.INSTANCE;
    }




}
