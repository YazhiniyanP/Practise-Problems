package com.zukun.java;

import java.util.Scanner;

public class TrafficLightSystem {
private static Scanner scanner;

public static void main (String [] args) {
	scanner = new Scanner (System.in);
	System.out.println("Enter the Character to do the action");
	String A=scanner.nextLine();
	//char A='G';
	//String R = null;
	//String G = null;
	System.out.println((A==G) ? "Go" : (A== R) ? "Stop" : "Illegal Expression");
}
}
