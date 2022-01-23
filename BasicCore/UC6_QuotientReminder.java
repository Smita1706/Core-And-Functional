package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC6_QuotientReminder {
	public static int Result;
	public class test {
		public static int Reminder(int a, int b) {
			return Result = a % b;
		}
		public static int Quotient(int a, int b) {
			return Result = a / b;
		}
		public static void main(String [] args){
			int x;
			int y;
			int Quotient;
			int Reminder;
			Scanner s = new Scanner(System.in);

			System.out.println("Enter value of x : ");
			x = s.nextInt();
			System.out.println("Enter value of y : ");
			y = s.nextInt();

			Quotient = Quotient(x, y);
			System.out.println("Quotient is : " + Quotient);
			Reminder = Reminder(x, y);
			System.out.println("Reminder is : " + Reminder);
		}
	}
}
