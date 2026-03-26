package com.javafundamentals.constructors;

//Create:
//
//Person(String name)
//
//Student(int id)
//
//👉 Call parent constructor using super().


class Singleton {

    private static Singleton obj = new Singleton();

    private Singleton() {
        System.out.println("Object Created");
    }

    public static Singleton getInstance() {
        return obj;
    }
}
public class Test {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}