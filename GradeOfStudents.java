package com.zukun.java;

import java.util.Scanner;

public class GradeOfStudents {
	private static Scanner scanner;

	public static void main(String[] args) {
		// input class
		scanner = new Scanner(System.in);
		System.out.println("Enter the Mark of the Student");
		int mark= scanner.nextInt();
		System.out.println((mark>=90) ? "Grade-A" : (mark>=80) ? "Grade-B" : (mark>=70) ? "Grade-C" :(mark>=60) ? "Grade-D" : " Grade-E");
}
}
