package com.marchenko.service;

import com.marchenko.configurator.InjectByType;

public class ConsoleAnnouncer implements Announcer {

    @InjectByType
    private Recommendator recommendator;

    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
