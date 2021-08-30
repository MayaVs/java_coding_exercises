package com.techreturners.exercise002;

class Person{
    private String FirstName;
    private String LastName;
    private String City;
    private int Age;

    Person(String firstName,String lastName, String city, int age){
        this.FirstName = firstName;
        this.LastName = lastName;
        this.City = city;
        this.Age = age;
    }

    public String getCity(){
        return this.City;
    }

    public int getAge(){
        return this.Age;
    }

}

public class Exercise002 {

    public boolean isFromManchester( Person person ) {
        return (person.getCity() == "Manchester");
    }

    public boolean canWatchFilm( Person person, int ageLimit) {
        return (person.getAge() >= ageLimit);
    }
    
}
