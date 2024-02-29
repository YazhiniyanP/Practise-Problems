package com.zukun.java;

import java.util.Scanner;

public class FireExtinguisher {
public static void main(String [] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Is Temperature is high?");
	String a=scanner.nextLine();
	System.out.println("Is Smoke is Producing?");
	String b=scanner.nextLine();
	System.out.println(((a="Yes"||"YES"||"yes" && b="Yes"||"YES"||"yes") ? "Fire Extinguisher On" : (a="Yes"||"YES"||"yes" || b="Yes"||"YES"||"yes") ? "Emergency Condition" : "Normal condition") ;
	}
}

