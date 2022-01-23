package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class UC9_VowelConsonent {
	public static void main(String [] args){
		char n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the alphabet : ");
		n = s.next().charAt(0);
		
		if((n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' || n=='O' || n=='U'))
			System.out.println("The alphabet " + n + " is a vovel");
		else if((n>='a' && n<='z' )||(n>='A' && n<='Z' ))
			System.out.println("The alphabet " + n + " is a Consonent");
		else
			System.out.println("The " + n + " is not a alphabet");
	}

}
