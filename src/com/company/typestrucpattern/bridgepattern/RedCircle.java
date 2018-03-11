package com.company.typestrucpattern.bridgepattern;

/**
 * DrawAPI接口的尸体桥接实现类
 */
public class RedCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [Color: red ,radius: "+ radius + " x:" + x + " y:" + y +"]");
    }
}
