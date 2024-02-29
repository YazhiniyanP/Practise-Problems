package com.zukun.java;
import java.util.Scanner;
public class GradeOfClass {
private static Scanner scanner;
public static void main (String [] args) {
	scanner = new Scanner(System.in);
	System.out.println("Enter the Grade of the Student");
	char Grade=scanner.next().charAt(0);
	switch(Grade) {
	case 'A':
		System.out.println("The Mark obtained by the Student is above 90");
		break;
	case 'B':
		System.out.println("The Mark obtained by the Student is 80 - 90");
		break;
	case 'C':
		System.out.println("The Mark obtained by the Student is 70 - 80");
		break;
	case 'D':
		System.out.println("The Mark obtained by the Student is 60 - 70");
		break;
	case 'E':
		System.out.println("The Mark obtained by the Student is 50 - 60");
		break;
	case 'F':
		System.out.println("The Mark obtained by the Student is below 50");
		break;
	default :
		System.out.println("Illegal Start of Expression");
		break;
	}
}
}
