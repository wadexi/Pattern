package com.company.typebehaviorpattern.observerpattern;

/**
 * 实体观察者类
 * 2进制输出数字
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));

    }
}
