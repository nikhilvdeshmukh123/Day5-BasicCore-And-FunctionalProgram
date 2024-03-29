package com.bridgelabz.day5.basicCore;
/*
 * @author : Nikhil
 * Flip Coin and print percentage of Heads and Tails
 */
import java.util.Scanner;

public class LeapYear{
	 //Main Method
    public static void main(String[] args){
    	//Variable declaration
    	int year = 0;
        System.out.println("Enter the year (should be a 4 - digit number) :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
      //Checking Condition for Leap year
        if((year > 1000) && (year < 9999)) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Year " +year +" is a leap year");
            else
                System.out.println("Year " +year +" is not a leap year");
        }
        else{
            System.out.println("Invalid input. Enter a 4 digit number");
        }
    }
}