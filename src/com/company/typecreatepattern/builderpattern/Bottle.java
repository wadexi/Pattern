package com.company.typecreatepattern.builderpattern;

/**
 * 瓶装(瓶子)
 */
public class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}
