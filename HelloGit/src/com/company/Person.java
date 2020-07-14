package com.company;

public class Person {

    private String Firstname;
    private String Lastname;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname (String firstname) {
        Firstname = firstname;
    }
    public String getFirstname(){
        return Firstname;
    }

    public void setLastname (String lastname) {
        Lastname = lastname;
    }
    public String getLastname(){
        return Lastname;
    }
}
