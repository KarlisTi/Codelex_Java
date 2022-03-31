package io.codelex.polymorphism.practice.exercise3;

public class mainClass {
    public static void main(String[] args) {
        Student studentOne = new Student("Janis", "Zarins", "Riekstu 5", 2465342, 3.0);
        Employee employeeOne = new Employee("Aldis", "Vanags", "Zaru 6", 23345423, "Manager");
        studentOne.display();
        System.out.println();
        employeeOne.display();
    }
}
