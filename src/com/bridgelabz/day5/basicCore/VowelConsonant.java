package com.bridgelabz.day5.basicCore;
/*
 * @author : Nikhil
 * Java Program to Check Whether an Alphabet is Vowel or Consonant
 */
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
    	//Scanner Object for User Input
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char input = in.next().charAt(0);
        //Checking for Character is Vowel or Consonant
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(input + " is vowel");
                break;
            default:
                System.out.println(input + " is consonant");
        }
    }
}