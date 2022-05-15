package com.bridgelabz.day5.basicCore;

/*
 * @author : Nikhil
 * Flip Coin and print percentage of Heads and Tails
 */
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// Variables declaration
		int heads = 0;
		int tails = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of times to flip the coin : ");
		int n = in.nextInt();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				double face = Math.random();
				// Counting the Head and Tail Occurance
				if (face > 0.5)
					heads++;
				else
					tails++;
			}
			// Calculating Percentage of Head vs Tail
			float hp = heads * 100 / n;
			float ht = tails * 100 / n;
			// Print Head & Tail Counts
			System.out.println("Heads : " + heads);
			System.out.println("Tails : " + tails);
			// Printing Percentage of Head vs Tail
			System.out.println("Percentage of Heads : " + hp);
			System.out.println("Percentage of Tails : " + ht);
		} else {
			System.out.println("Invalid value of n.");
		}
	}
}