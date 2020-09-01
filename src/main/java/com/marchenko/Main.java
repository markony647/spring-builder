package com.marchenko;

public class Main {

    public static void main(String[] args) {
        CoronaDesinfector coronaDesinfector = ObjectFactory.getInstance().createObject(CoronaDesinfector.class);
        coronaDesinfector.start(new Room());
    }
}
