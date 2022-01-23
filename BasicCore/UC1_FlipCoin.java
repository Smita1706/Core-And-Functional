package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC1_FlipCoin {
	public static void main(String [] args){
		int n;
		double Flip;
		int i;
		float TCounter = 0;
		float HCounter = 0;
		float Tpercent = 0;
		float Hpercent = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of coin flip : ");
		n = s.nextInt();

		for(i = 0; i < n; i++) {
			Flip = Math.random() ;
			if(Flip < 0.5) 
				TCounter++;
			else 
				HCounter++;
		}

		Tpercent = (float)(TCounter/n) * 100;
		Hpercent = (float)(HCounter/n) * 100;
		System.out.println("Percentage of Tail over Head is : " + Tpercent);
		System.out.println("Percentage of Head over Tail is : " + Hpercent);
	}	
}
