package com.company.typestrucpattern.bridgepattern;

public class Circle extends Shape{

    private int x,y,radius;

    protected Circle(int x,int y,int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        //现在只能画圆，可以独立变成也可以画正方形
        drawAPI.drawCircle(radius,x,y);
    }
}
