package io.codelex.oop.Exercise2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee extends Person {

    private String position;
    private String startedWorking;


    public Employee(String firstName, String lastName, String position, String startedWorking) {
        super(firstName, lastName);
        this.position = position;
        this.startedWorking = startedWorking;

    }


    public long getWorkExpierence() {
        String date = this.startedWorking;
        LocalDate startDate = LocalDate.parse(date);
        LocalDate today = LocalDate.now();
        long workExpierence = ChronoUnit.YEARS.between(startDate, today);
        return workExpierence;
    }

    @Override
    String getInfo() {
        return getFirstName() + " " + getLastName() + " " + this.position + " with " + getWorkExpierence() + " year experience";

    }
}
