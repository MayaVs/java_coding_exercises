package com.techreturners.exercise002;

class Person{
    final private String firstName;
    final private String lastName;
    final private String city;
    final private int age;

    Person(String firstName, String lastName, String city, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getCity(){
        return this.city;
    }

    public int getAge(){
        return this.age;
    }

}