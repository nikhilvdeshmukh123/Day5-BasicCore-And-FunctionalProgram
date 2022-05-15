package com.bridgelabz.day5.basicCore;
/*
 * @author : Nikhil
 * Java Program to Find the Largest Among Three Numbers
 */
import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
    	//Variable Declaration
        int a,b,c;
        //Scanner Object for User Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = input.nextInt();
        System.out.println("Enter the second number:");
        b = input.nextInt();
        System.out.println("Enter the third number:");
        c = input.nextInt();
        //Checking for the Largest Value using nested if-else
        if(a>=b && a>=c)
            System.out.println(a+" is the largest Number");
        else if (b>=a && b>=c)
            System.out.println(b+" is the largest Number");
        else
            System.out.println(c+" is the largest number");
    }
}