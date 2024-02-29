package com.zukun.java;

import java.util.Scanner;

public class GreatestAmongThreeNumbers {

		private static Scanner scanner;

		public static void main(String[] args) {
			// input class
			scanner = new Scanner(System.in);
			System.out.println("Enter the First Number");
			int a= scanner.nextInt(); // declaring the input variable
			System.out.println("Enter the Second Number");
			int b= scanner.nextInt();
			System.out.println("Enter the Third Number");
			int c= scanner.nextInt();
			System.out.println(((a>b) && (a>c))? "The greatest number is " +a :((b>a) && (b>c)) ? "The greatest number is " + b : "The greatest number is " + c );
}
	}

