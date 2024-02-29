package com.zukun.java;
import java.util.Scanner;
public class CarGearSystem {
private static Scanner scanner;
public static void main(String [] args) {
	scanner = new Scanner(System.in);
	System.out.println("Enter the number to know the Gearing System");
	byte a=scanner.nextByte();
	switch(a) {
	case 1:
		System.out.println("The car in 1st Year: Can Increase the Speed");
		break;
	case 2:
		System.out.println("The car in 2nd Year: Can Increase the Speed");
		break;
	case 3:
		System.out.println("The car in 3rd Year: The Car is in Optimal Condition");
		break;
	case 4:
		System.out.println("The car in 4th Year: Can Decrease the Speed");
		break;
	case 5:
		System.out.println("The car in 5th Year: Can Decrease the Speed");
		break;
	case 6:
		System.out.println("The car in Reverse Year: Can Increase the Speed");
		break;
    default:
    	System.out.println("Doesn't involve in gearing system");
    	break;
	}
}
}
