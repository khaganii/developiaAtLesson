package singletonDesignPattern;

public class Person {
    // It is singleton design pattern
    // You can create only one object from a class

    private int age;
    private String name;
    private static Person person = new Person();

    public static Person getObject(){
        return person;
    }
    private Person(){

    }
}
