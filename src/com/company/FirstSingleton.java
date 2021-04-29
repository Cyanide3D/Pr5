package com.company;

public class FirstSingleton {

    private static FirstSingleton INSTANCE;

    private FirstSingleton() {
    }

    public static FirstSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FirstSingleton();
        }
        return INSTANCE;
    }
}
