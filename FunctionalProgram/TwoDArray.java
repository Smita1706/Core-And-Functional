package com.bridgelabz.FunctionalProgram;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	public static Scanner sc =new Scanner(System.in);
	public static PrintWriter pw = new PrintWriter(System.out);

	public static void GetIntValues(int rows, int columns) {
		int i, j;
		int [][]Arr = new int [rows][columns];

		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.println("enter the value of [" + i + "][" + j+"]==>");
				Arr[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < rows; i++) {
			for ( j = 0; j < columns; j++) {
				pw.write("" + Arr[i][j] +"\t");
				pw.flush();
			}
			System.out.println("");
		}

	}

	public static void GetDoubleValues(int rows, int columns) {
		int i,j;
		double [][]Arr = new double [rows][columns];

		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.println("enter the value of [" + i + "][" + j+"]==>");
				Arr[i][j] = sc.nextDouble();
			}
		}

		for (i = 0; i < rows; i++) {
			for ( j = 0; j < columns; j++) {
				pw.write("" + Arr[i][j] +"\t");
				pw.flush();
			}
			System.out.println("");
		}

	}

	public static void GetBooleanValues(int rows, int columns) {
		int i,j;
		boolean [][]Arr = new boolean [rows][columns];

		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.println("enter the value of [" + i + "][" + j+"]==>");
				Arr[i][j] = sc.nextBoolean();
			}
		}

		for (i = 0; i < rows; i++) {
			for ( j = 0; j < columns; j++) {
				pw.write("" + Arr[i][j] +"\t");
				pw.flush();
			}
			System.out.println("");
		}

	}
	public static void main(String [] args){
		int rows;
		int columns;
		System.out.println("enter no of rows");
		rows = sc.nextInt();

		System.out.println("enter no of columns");
		columns = sc.nextInt();

		System.out.println(" 1. Integer\n 2. Double\n 3. Booleans");
		int ch = sc.nextInt();

		switch(ch) {
		case 1: 
			GetIntValues(rows, columns);
			break;
		case 2: 
			GetDoubleValues(rows, columns);
			break;
		case 3: 
			GetBooleanValues(rows, columns);
			break;
		default: 
			System.out.println(" Please enter a correct choice");
			break;
		}  

	}
}
