package com.marchenko;

public class ConsoleAnnouncer implements Announcer {

    private Recommendator recommendator = ObjectFactory.getInstance().createObject(Recommendator.class);

    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
