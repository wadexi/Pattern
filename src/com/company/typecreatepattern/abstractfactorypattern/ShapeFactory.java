package com.company.typecreatepattern.abstractfactorypattern;

class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
       if(shape == null || "".equals(shape)){
           return null;
       }

       if(shape.equalsIgnoreCase("circle")){
           return new Circle();
       }else if(shape.equalsIgnoreCase("rectangle")){
           return new Rectangle();
       }else if(shape.equalsIgnoreCase("square")){
           return new Square();
       }
       return null;
    }
}
