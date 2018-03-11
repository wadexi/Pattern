package com.company.typestrucpattern.bridgepattern;

public class BridgePatternMain {

    public static void main(String[] args) {

        Shape redCircle = new Circle(0,0,10,new RedCircle());
        Shape greenCircle = new Circle(0,0,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
