package io.codelex.training;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int y = in.nextInt();
        int iDay = 0;

// Create a calendar object and set year and month
        Calendar mycal = new GregorianCalendar(y, m, iDay);

// Get the number of days in that month
        int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28

        System.out.println(daysInMonth);
    }
}

