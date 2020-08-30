package com.marchenko;

import lombok.SneakyThrows;

public class ObjectFactory {
    private static final ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig("com.marchenko");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {

    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        return implClass.getDeclaredConstructor().newInstance();
    }
}
