package com.company.typecreatepattern.abstractfactorypattern;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        //shape
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();

        //color
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
        Color blue = colorFactory.getColor("blue");
        blue.fill();
        Color green = colorFactory.getColor("green");
        green.fill();
    }
}
