package com.marchenko;

public class Main {

    public static void main(String[] args) {
        CoronaDesinfector coronaDesinfector = new CoronaDesinfector();
        coronaDesinfector.start(new Room());
    }
}
