package com.company.typestrucpattern.bridgepattern;

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    //现在只能画，可以独立变化为可以 ‘写’
    public abstract void draw();
}
