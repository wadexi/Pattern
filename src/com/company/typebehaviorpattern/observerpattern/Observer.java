package com.company.typebehaviorpattern.observerpattern;

public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
