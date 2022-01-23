package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC4_HarmonicValue {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		double Sum = 0.0;
		int n;

		System.out.print(" Please enter the value of n: ");
		n = scan.nextInt();

		if (n <= 0) {
			System.out.println(" Please enter a value greater than 0");
		}

		for (int i = 1; i <= n; i++) {
			Sum += (1 / (double)i);
		}

		System.out.println(" The final value is: " + Sum);
	}
}
