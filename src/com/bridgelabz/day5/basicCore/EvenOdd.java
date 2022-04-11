package com.bridgelabz.day5.basicCore;
/*
 * @author : Nikhil
 * Java Program to Check Whether a Number is Even or Odd
 */
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    	//Scanner Object for user input
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        //Checking for Even or Odd Number using Mod Operator
        if(n%2==0) {
            System.out.println(n +" is even");
        }
        else {
            System.out.println(n +" is odd");
        }
    }
}