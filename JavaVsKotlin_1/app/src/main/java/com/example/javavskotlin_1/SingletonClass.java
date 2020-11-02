package com.example.javavskotlin_1;

public class SingletonClass {
    private static SingletonClass INSTANCE;
    public static SingletonClass getInstance(){
        if (INSTANCE ==null) {
            synchronized (SingletonClass.class){
                INSTANCE = new SingletonClass();
            }
        }
        return INSTANCE;
    }
}
