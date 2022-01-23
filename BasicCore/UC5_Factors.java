package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC5_Factors {
	public static void main(String [] args){
		int n;
		int i;
		int Result = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial : ");
		n = s.nextInt();
		for(i = 1; i <= n; i++) {
			Result = Result * i;
		}
		System.out.println("Factorial of " + n + " is " + Result);
	}
}
