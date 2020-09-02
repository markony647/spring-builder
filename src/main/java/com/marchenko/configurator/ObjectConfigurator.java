package com.marchenko.configurator;

import com.marchenko.ApplicationContext;

public interface ObjectConfigurator {

    void configure(Object t, ApplicationContext context);
}
