package com.company.typecreatepattern.factorypattern;

class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType == null || "".equals(shapeType)){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }

        return null;
    }

    public static Shape staticGetShape(String shapeType){

        if(shapeType == null || "".equals(shapeType)){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }

        return null;
    }

    public static Object reflectGetShape(Class<? extends Shape> tClass){

        try {
            Object t =  Class.forName(tClass.getName()).newInstance();
            return t;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> T reflectGetShape2(Class< T> tClass){

        try {
            T t = (T) Class.forName(tClass.getName()).newInstance();
            return t;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }



}
