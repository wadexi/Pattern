package com.company.typecreatepattern.abstractfactorypattern;

class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green: fill() method.");
    }
}
