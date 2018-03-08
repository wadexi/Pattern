package com.company.builderpattern;

/**
 * Wrapper: 纸盒(包装纸)
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
