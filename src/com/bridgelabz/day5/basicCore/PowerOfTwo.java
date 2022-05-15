package com.bridgelabz.day5.basicCore;
/*
 * @author : Nikhil
 * Power of two
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		// Accepting Command Line Argument Value in Variable
		int n = Integer.parseInt(args[0]);

		System.out.println("Number for Power : " + n);

		// Checking for Validation of Power No
		if (n <= 0 || n > 31) {
			System.out.println("The Power Number must be Greater Than Zero and Less Than 31");
		} else {
			// Repeat untill i less than or equals to N
			for (int i = 1; i <= n; i++) {
				// Use Math Power Function to calculate the Power of Number
				int powerOfNo = (int) Math.pow(2, i);
				System.out.println(powerOfNo);
			}
		}
	}
}