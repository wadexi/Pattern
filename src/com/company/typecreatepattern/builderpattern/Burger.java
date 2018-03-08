package com.company.typecreatepattern.builderpattern;

/**
 * 汉堡
 * 实现Item接口的抽象类，该类实现默认的功能(汉堡一般都是盒装的，不是瓶装的)
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
