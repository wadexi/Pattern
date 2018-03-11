package com.company.typebehaviorpattern.observerpattern;

public class ObserverPatternMain {

    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);

        subject.setState(256);
        System.out.println("=============");
        subject.setState(639854);
    }
}
