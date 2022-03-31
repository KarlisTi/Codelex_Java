package io.codelex.polymorphism.practice.exercise4;

public class Staff {
    static StaffMember[] staffList;


    //-----------------------------------------------------------------
    // Sets up the list of staff members.
    //-----------------------------------------------------------------


    //-----------------------------------------------------------------
    // Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            amount = staffList[count].pay(); // polymorphic
            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
            System.out.println("-----------------------------------");
        }
    }
} 
