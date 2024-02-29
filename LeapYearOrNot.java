package com.zukun.java;

import java.util.Scanner;

public class LeapYearOrNot {

	private static Scanner scanner;

	public static void main(String[] args) {
		// input class
		scanner = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year= scanner.nextInt(); // declaring the input variable
		/*
		 if(Year%4==0 && Year%400==0) {
			System.out.println(Year+ " is leap year");
		}else
			System.out.println(Year+ "is not leap year");
			*/ 
		System.out.println((year%4==0 && year%400==0)? year+ " is Leap Year" : year+ " is Not Leap Year");
	}

}
