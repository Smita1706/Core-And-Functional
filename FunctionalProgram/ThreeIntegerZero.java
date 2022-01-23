package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class ThreeIntegerZero {
	public static void main(String[] args)
	{
		int n;
		int i, j, k;
		int Length, Triplet = 0;
		boolean found = false;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		n = s.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter elements of the array : ");
		for(i = 0; i < n; i++) {
			System.out.println("enter the value of [" + i + "]");
			arr[i] = s.nextInt();
		}
		Length = arr.length;

		for ( i = 0; i < n-2; i++)
		{
			for ( j = i+1; j < n-1; j++)
			{
				for (k = j+1; k < n; k++)
				{
					if (arr[i] + arr[j] + arr[k] == 0)
					{
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						found = true;
						Triplet ++;
					}
				}
			}
		}

		if (found == false)
			System.out.println("Not exist ");
		else 
			System.out.println(Triplet + " Triplets are found  " );

	}

}
