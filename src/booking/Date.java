/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */

public class Date {
         public  int year;
         public int month;
         public int day;
         private int DAYS_IN_MONTH;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date" + "year=" + year + ", month=" + month + ", day=" + day ;
        
    }
    public int numOfDays(int year, int month) {
            final int[] DAYS_IN_MONTH = {
                   31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
               };
           // Check if it's a leap year (divisible by 4).
        boolean isLeapYear = (year % 4 == 0);
        // Adjust February days to 29 if it's a leap year.
        if (isLeapYear && month == 2) {
            return 29;
        }

//        DAYS_IN_MONTH[11]
        // Return the number of days for the given month.
        return DAYS_IN_MONTH[month - 1];
    }
    
    
}