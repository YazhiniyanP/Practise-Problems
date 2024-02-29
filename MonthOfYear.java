package com.zukun.java;
import java.util.Scanner;
public class MonthOfYear {
private static Scanner scanner;
public static void main(String [] args) {
	scanner = new Scanner(System.in);
	System.out.println("Enter the number to determine the month");
	short a=scanner.nextShort();
	switch(a) {
	case 1:
		System.out.println("The month is January");
		break;
	case 2:
		System.out.println("The month is Febraury");
		break;
	case 3:
		System.out.println("The month is March");
		break;
	case 4:
		System.out.println("The month is April");
		break;
	case 5:
		System.out.println("The month is May");
		break;
	case 6:
		System.out.println("The month is June");
		break;
	case 7:
		System.out.println("The month is July");
		break;
	case 8:
		System.out.println("The month is August");
		break;
	case 9:
		System.out.println("The month is September");
		break;
	case 10:
		System.out.println("The month is October");
		break;
	case 11:
		System.out.println("The month is November");
		break;
	case 12:
		System.out.println("The month is December");
		break;
	default:
		System.out.println("Incorrect data entered");
		break;
	}
}
}
