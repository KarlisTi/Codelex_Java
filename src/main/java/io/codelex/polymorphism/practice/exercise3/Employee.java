package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {

    private String jobTitle;


    public Employee(String firstName, String lastName, String adress, int id, String jobTitle) {
        super(firstName, lastName, adress, id);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee name: " + getFirstName());
        System.out.println("Employee last name: " + getLastName());
        System.out.println("Address: " + getAdress());
        System.out.println("Job Title: " + getJobTitle());
        System.out.println("ID: " + getId());
    }
}
