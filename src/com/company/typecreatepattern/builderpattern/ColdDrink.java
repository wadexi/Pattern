package com.company.typecreatepattern.builderpattern;

/**
 * 冷饮
 * 一般都是瓶装，没有盒装的
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
