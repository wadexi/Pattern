package com.company.factorypattern;

/**
 * 工厂模式
 */
public class FactoryPattern {

    public static void main(String[] args) {
        //1. getShape
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape circle = shapeFactory.getShape("Circle");
//        circle.draw();
//        Shape rectangle = shapeFactory.getShape("Rectangle");
//        rectangle.draw();
//        Shape square = shapeFactory.getShape("Square");
//        square.draw();

//        Shape circle = ShapeFactory.staticGetShape("Circle");
//        circle.draw();
//        Shape rectangle = ShapeFactory.staticGetShape("rectangle");
//        rectangle.draw();
//        Shape square = ShapeFactory.staticGetShape("square");
//        square.draw();

//        Circle circle = (Circle) ShapeFactory.reflectGetShape(Circle.class);
//        circle.draw();
//        Square square = (Square) ShapeFactory.reflectGetShape(Square.class);
//        square.draw();
//        Rectangle rectangle = (Rectangle) ShapeFactory.reflectGetShape(Rectangle.class);
//        rectangle.draw();

        Circle circle = ShapeFactory.reflectGetShape2(Circle.class);
        circle.draw();
        Square square = ShapeFactory.reflectGetShape2(Square.class);
        square.draw();
        Rectangle rectangle = ShapeFactory.reflectGetShape2(Rectangle.class);
        rectangle.draw();


    }

}
