package com.company.abstractfactorypattern;

class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if(color == null || "".equals(color)){
            return null;
        }

        if(color.equalsIgnoreCase("red")){
            return new Red();
        }else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }else if(color.equalsIgnoreCase("green")){
            return new Green();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
