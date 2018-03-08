package com.company.abstractfactorypattern;

/**
 * 获取工厂的抽象类
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
