package com.example;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int randomNumber = (int)(Math.random()*100);
		int userNumber;
		do {
			System.out.println("Guess the number : ");
			userNumber = sc.nextInt();
			
			if(userNumber==randomNumber) {
				System.out.println("BRAHO... COREECT NUMBER!");
				break;
			}else if(userNumber>randomNumber) {
				System.out.println("Number is too large.");
			}else {
				System.out.println("Number is too small.");
			}
		}
		while(userNumber>=0);
	}
}
