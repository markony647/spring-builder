package com.marchenko.service;

import com.marchenko.Singleton;
import com.marchenko.configurator.InjectProperty;

@Singleton
public class RecommendatorImpl implements Recommendator {

    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from flue drink, " + alcohol);
    }
}
