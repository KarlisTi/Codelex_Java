package io.codelex.polymorphism.practice.exercise4;

public class Firm {
    //-----------------------------------------------------------------
    // Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        StaffMember[] staffList;
        Staff newStaff = new Staff();
        staffList = new StaffMember[8];
        staffList[0] = new Executive("Sam", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line",
                "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker",
                "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.",
                "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.",
                "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane",
                "555-7282");
        staffList[6] = new Commision("Janis", "Ligo 10", "26445367", "4534345345", 6.25, 0.2);
        staffList[7] = new Commision("Janis", "Brivibas 23", "2565464564", "476-34-34545", 9.75, 15);
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        ((Commision) staffList[6]).addHours(35);
        ((Commision) staffList[6]).addSales(400);
        ((Commision) staffList[7]).addHours(40);
        ((Commision) staffList[7]).addSales(950);

    }

}

