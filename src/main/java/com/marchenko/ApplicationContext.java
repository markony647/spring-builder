package com.marchenko;

import com.marchenko.config.Config;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {
    @Setter
    private ObjectFactory objectFactory;
    private Map<Class, Object> cache = new ConcurrentHashMap<>();

    @Getter
    private final Config config;

    public ApplicationContext(Config config) {
        this.config = config;
    }

    @SneakyThrows
    public <T> T getObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (cache.containsKey(type)) {
            return (T) cache.get(type);
        }
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        T t = objectFactory.createObject(implClass);
        if (implClass.isAnnotationPresent(Singleton.class)) {
            cache.put(type, t);
        }
        return t;
    }
 }
