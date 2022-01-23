package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC3_PowerOfTwo {
	public static void main(String [] args){
		int n ;
		int Base = 2; 
		int Power = 1;
		Scanner s = new Scanner(System.in);
		System.out.print(" Please enter the number between 0 and 31 : ");
		n = s.nextInt();

		if (n > 31 || n < 0) 
			System.out.println(" Please enter a value between 0 and 31");
		else {
			for (int i = 1; i <= n; i++) {
				Power = Power * Base;
				System.out.println(Power);
			}
		}
	}
}
