package com.bridgelabz.FunctionalProgram;

import java.util.Scanner;

public class WindChill {
	public static void main(String [] args){
		double t, v, Wind;
		Scanner s = new Scanner(System.in);

		System.out.print(" Please enter the value of temperature t(F): ");
		t = s.nextDouble();
		if(t > 50) {
			System.out.println(" Please enter a temp value less than 50");
			return;
		}
		System.out.print(" Please enter the value of wind speed v(Mph): ");

		v = s.nextDouble();
		if(v > 120 || v < 3) {
			System.out.println(" Please enter a wind speed between 3 and 120");
			return;
		}
		Wind = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);

		System.out.println(" The wind speed is: " + Wind);
	}
}
