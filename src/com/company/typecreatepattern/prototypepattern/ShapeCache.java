package com.company.typecreatepattern.prototypepattern;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap
            = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 模拟每个形状都需要查询数据库
     */
    public static void loadCache(){

        //实际得查询数据库才能获得
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);


        //实际得查询数据库才能获得
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        //实际得查询数据库才能获得
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
