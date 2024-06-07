/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.leapmonth;

//import java.util.Scanner;

public class leapmonth {
      public static void main(String[] args) {
        // decalring varibales
        int year = 2020;
        int month = 6;

        boolean isLeapMonth = isLeapMonth(year, month);
        System.out.println("The " + month + " month in the Year: " + year + " is a leap month: " );
        System.out.println( " it is " +isLeapMonth);    
    }

    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0); // Year is divisible by 4 
        isLeapMonth = isLeapMonth && (month % 100 != 0); //  AND Month is not divisible by 100
        isLeapMonth = isLeapMonth || (month % 400 == 0); // OR month divisible by 400
        return isLeapMonth;
    }
    
}
     




    
    
    

