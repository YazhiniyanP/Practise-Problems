package com.zukun.java;
import java.util.Scanner;
public class MultiplicationTable {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter the number to print that Multiplication Table");
		int a=scanner.nextInt();
		System.out.println("Enter the limit to print the multiplication table");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(i+" * "+a+" = "+i*a);
		}	
	}
}
