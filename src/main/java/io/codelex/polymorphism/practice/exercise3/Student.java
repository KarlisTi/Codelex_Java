package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {

    private double gpa;


    public Student(String firstName, String lastName, String adress, int id, double gpa) {
        super(firstName, lastName, adress, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student first name: " + getFirstName());
        System.out.println("Student last name: " + getLastName());
        System.out.println("Adress: " + getAdress());
        System.out.println("GPA: " + getGpa());
        System.out.println("ID: " + getId());
    }
}
