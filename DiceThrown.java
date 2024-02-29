package com.zukun.java;
import java.util.Scanner;
public class DiceThrown {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter the number in the thrown dice appears");
		String a =scanner.nextLine();
		switch(a) {
		case "Zero" :
			System.out.println("The entered numbered is 0");
			break;
		case "One" :
			System.out.println("The entered numbered is 1");
			break;
		case "Two" :
			System.out.println("The entered numbered is 2");
			break;
		case "Four" :
			System.out.println("The entered numbered is 4");
			break;
		case "Six" :
			System.out.println("The entered numbered is 6");
			break;
			default:
				System.out.println("Incoorect number entered");
		}
	}
}
