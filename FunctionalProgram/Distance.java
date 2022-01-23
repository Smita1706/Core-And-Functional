package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;
public class Distance {
	public static void main(String [] args){
		int x;
		int y;
		double Length;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		x = s.nextInt();

		System.out.println("Enter the value of y : ");
		y = s.nextInt();

		Length = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println(" The distance of the point from the origin is: " + Length);
	}
}
