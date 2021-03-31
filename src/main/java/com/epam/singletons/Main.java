package com.epam.singletons;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;

/**
 * Практика
 * Сделать так, чтобы можно было иметь два экземпляра singletone объекта в Runtime.
 */

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        try {
            Singleton secondSingleton = (Singleton) Reflection.getSingleton();
            if (singleton != secondSingleton) {
                System.out.println("We've created two singleton objects:\n" + singleton + "\n" + secondSingleton);
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

