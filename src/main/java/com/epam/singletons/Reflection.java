package com.epam.singletons;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    static Singleton secondSingleton;

    public static Object getSingleton() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        secondSingleton = constructor.newInstance();
        constructor.setAccessible(false);
        return secondSingleton;
    }
}
