package com.bridgelabz.day5.FunctionalProgramming;
/*
 * @author : Nikhil
 * Write a program WindChill.java that takes two double command-line arguments t
 * and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
 * temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
 * National Weather Service defines the effective temperature (the wind chill)
 */
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		//Scanner Class to take Input from User
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit :");
		double temp = scan.nextDouble();
		System.out.println("Enter the wind speed in miles per hour: ");
		double speed = scan.nextDouble();
		//Formula is valid for these conditions only
		if (temp < 50 && speed < 120 && speed > 3) {
			//Formula to get Wind Chill Temperature
			double windChill = 35.74 + 0.62158 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
			System.out.println("The windchill is :" + windChill);
		} else
			System.out.println("Invalid input");
	}
}