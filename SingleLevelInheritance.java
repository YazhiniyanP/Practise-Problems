package com.zukun.java;

import java.util.Scanner;

class Company{
	String eCompany;
	String eDepartment;
	int eEmployee;
	private Scanner sc;
	private int eTotalEmployee2;
	
	Company(String eCompany, String eDepartment, int eEmployee){
	this.eCompany=eCompany;
	this.eDepartment=eDepartment;
	this.eEmployee=eEmployee;
	sc = new Scanner(System.in);
	System.out.println("Enter the Number of New Employess");
	int a=sc.nextInt();
	eTotalEmployee2 = eEmployee + a;
	}
	void details() {
		System.out.println("Company Name is " +eCompany);
		System.out.println("Employee Department is " +eDepartment);
		System.out.println("Employee Old Employess is " +eEmployee);
		//int eTotalEmployee=eEmployee + a;
		System.out.println("Total Employess are " +eTotalEmployee2);
	}	
}

class Manager1 extends Company{
	
	String mName;
	long mSalary;
	long mRevisedSalary;
	
	Manager1(String eCompany, String eDepartment, int eEmployee, String mName, long mSalary){
	super(eCompany,eDepartment,eEmployee);
	this.mName=mName;
	this.mSalary=mSalary;
	}
	
	void data() {
		details();
		System.out.println("Manager Name is " +mName);
		System.out.println("Manager Old Saalry is " +mSalary);
		mRevisedSalary=mSalary + 2000;
		System.out.println("Manager Revised Salary is" +mRevisedSalary);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Manager1 man=new Manager1("Tech IT" , "Process Assosiative" , 40, "Naveen", 42000);
     man.data();   
	}
}
