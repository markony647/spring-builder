package com.marchenko;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> type);
}
