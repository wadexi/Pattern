package com.company.typecreatepattern.abstractfactorypattern;

class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice == null || "".equalsIgnoreCase(choice)){
            return null;
        }

        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
