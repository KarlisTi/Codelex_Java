package io.codelex.arithmetic.practice;

public class Exercise8 {

    public static double totalPay(double basePay, int h) {
        double total = basePay * h;
        if (h > 40) {
            System.out.println(total *= 1.5);
        } else if (h < 40) {
            System.out.println("Can't be less than 40 hours");
        } else{
            System.out.println(total);
        }
        return total;
    }

    public static void main(String[] args) {
        double employeeOne = totalPay(8, 35);
        double employeeTwo = totalPay(8, 47);
        double employeeThree = totalPay(8, 73);
    }


}

