package com.zukun.java;

import java.util.Scanner;

public class ParameterizedMethod {

	private static Scanner sc;


	public static void main(String[] args) {
		 ParameterizedCalculation i=new ParameterizedCalculation();
		  ParameterizedCalculation j=new ParameterizedCalculation();
		  /*
		  i.amount=1000;
		  i.year=2;
		  i.interestPercentage=0.75f;
		  */
		   i.simpleInterest(1000,2,0.75f);
		 
		   j.amount=5000;
		   j.year=3;
		   j.interestPercentage=0.90f;
		   
		   j.simpleInterest(5000,3,0.90f);
		   
		   sc = new Scanner(System.in);
	System.out.println("Enter the amount");
	double a = sc.nextDouble();
	System.out.println("Enter the Number of Years to be deposited");
	int b = sc.nextInt();
	System.out.println("Enter the Interest Percentage");
	float c = sc.nextFloat();
	
	i.simpleInterest(a, b, c);
	
	System.out.println("Enter the 2nd person amount");
	double d=sc.nextDouble();
	System.out.println("Enter the Number of Years to be deposited");
	int e=sc.nextInt();
	System.out.println("Enter the Interest Percentage");
	float f=sc.nextFloat();
	
	j.simpleInterest(d, e, f);
	
	}

}
