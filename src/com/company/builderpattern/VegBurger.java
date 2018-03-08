package com.company.builderpattern;

/**
 * VegBurger 扩展burger的实体类
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 18.0f;
    }
}
