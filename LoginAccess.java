package com.zukun.java;

import java.util.Scanner;

public class LoginAccess {
private static Scanner scanner;

public static void main (String [] args) {
	int password=256798;
	scanner = new Scanner(System.in);
		System.out.println("Enter the password to be proceed");
		int login=scanner.nextInt();
		System.out.println((password==login) ? "Access Granted" : " Access Denied");
	}
}

