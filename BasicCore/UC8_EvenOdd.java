package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC8_EvenOdd {
		public static void main(String [] args){
			int n;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the number : ");
			n = s.nextInt();
			
			if(n % 2 == 0)
				System.out.println("The number " + n + " is even number");
			else
				System.out.println("The number " + n + " is odd number");
		}
	}

