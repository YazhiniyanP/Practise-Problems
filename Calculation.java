package com.zukun.java;

public class Calculation{
	double amount;
	int year;
	float interestPercentage;

	public void simpleInterest() {
	double interest= ((amount * year * interestPercentage)/100);
	System.out.println("Interst is " +interest);
	double total= amount + interest;
	System.out.println( "the Total Amount is " +total);
	}	
}