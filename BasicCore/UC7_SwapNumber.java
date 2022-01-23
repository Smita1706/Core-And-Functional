package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC7_SwapNumber{

	public static void Swap(int a,int b) {
		int Temp;
		Temp = a;
		a = b;
		b = Temp;
		System.out.println("\nYeh values are swaped");	
		System.out.println("Value of x is : " + a + "\nValue of y is : " + b );
	}

	public static void main(String [] args){
		int x;
		int y;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter value of x : ");
		x = s.nextInt();

		System.out.println("Enter value of y : ");
		y = s.nextInt();

		Swap(x,y);
	}
}
