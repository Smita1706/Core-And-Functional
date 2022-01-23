package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC2_LeapYear {
	public static void main(String [] args){
		int Year;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		Year = s.nextInt();

		if(Year < 1000 )
			System.out.println("Please enter the valide Year ");
		
		if((Year % 4 == 0 && Year % 100 != 0 )|| Year % 400 == 0)
			System.out.println("Year " + Year + " is leap Year");
		else
			System.out.println("Year " + Year + " is not leap Year");
	}
}
