package com.zukun.java;

import java.util.Scanner;

public class AgeGroupDetermination {
private static Scanner scanner;

public static void main (String []  args) {
	scanner = new Scanner(System.in); 
		System.out.println("Enetr the age of the person");
		int a=scanner.nextInt();
		System.out.println((a<13)?"Child" : (a<22) ? "Teen" : (a<60) ? "Adult" : "Elder");
	}
}

