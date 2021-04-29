package com.company;

public class Main {

    public static void main(String[] args) {
        FirstSingleton firstSingleton = FirstSingleton.getInstance();
        SecondSingleton secondSingleton = SecondSingleton.INSTANCE;
        ThirdSingleton thirdSingleton = ThirdSingleton.getInstance();
    }
}
