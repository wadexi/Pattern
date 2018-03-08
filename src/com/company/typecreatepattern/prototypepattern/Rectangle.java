package com.company.typecreatepattern.prototypepattern;

class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle: draw() method" );
    }
}
