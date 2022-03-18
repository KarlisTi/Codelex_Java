package io.codelex.oop.Exercise2;

abstract class Person {
    String firstName;
    String lastName;
    String id;
    int age;

    public Person(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getAge() {
        return age;
    }

    abstract String getInfo();
}
