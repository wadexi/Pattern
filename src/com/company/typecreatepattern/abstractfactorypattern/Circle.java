package com.company.typecreatepattern.abstractfactorypattern;

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle : draw() method");
    }
}
