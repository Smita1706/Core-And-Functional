package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class Quadratic {
	public static void main(String [] args){
		int a;
		int b;
		int c;
		int Delta;
		double x1;
		double x2;
		Scanner s = new Scanner(System.in);

		System.out.print(" Please enter the value of a: ");
		a = s.nextInt();

		System.out.print(" Please enter the value of b: ");
		b = s.nextInt();

		System.out.print(" Please enter the value of c: ");
		c = s.nextInt();

		Delta = b*b - 4*a*c;
		x1 = (-b + Math.sqrt(Delta)) / 2*a;
		x2 = (-b - Math.sqrt(Delta)) / 2*a;

		System.out.println(" The two roots are: " + x1 + " and " + x2);
	}
}
