package com.barreraGermanDepencencyInjection;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        SeContainer initialize = initializer.initialize();
        Instance<Developer> lazyDeveloper = initialize.select(Developer.class);
        Developer developer = lazyDeveloper.get();
        String message = developer.develop();
        System.out.println(message);


    }
}