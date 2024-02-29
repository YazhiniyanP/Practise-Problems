package com.zukun.java;
import java.util.Scanner;
public class DaysInWeek {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter the number to determine the day in the week");
		int a=scanner.nextInt();
		switch(a) {
		case 1:
			System.out.println("The day is Monday");
			break;
		case 2:
			System.out.println("The day is Tuesday");
			break;
		case 3:
			System.out.println("The day is Wednesday");
			break;
		case 4:
			System.out.println("The day is Thursday");
			break;
		case 5:
			System.out.println("The day is Friday");
			break;
		case 6:
			System.out.println("The day is Saturday");
			break;
		case 7:
			System.out.println("The day is Sunday");
			break;
			default:
				System.out.println("Illegal Statement entered");	
		}
	}
}
