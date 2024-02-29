package com.zukun.java;

import java.util.Scanner;

class Company1 {
	 String cCompany;
	 int cEmployee;
	 int cNewEmployee;
	 String cLocation;
	private Scanner sc;
	
      Company1(String cCompany, int cEmployee, String cLocation){
		this.cCompany=cCompany;
		this.cEmployee=cEmployee;
		this.cLocation=cLocation;
      }
		void company() {
			sc = new Scanner(System.in);
			System.out.println("Enter the number of new employees");
			int a=sc.nextInt();
			cNewEmployee=cEmployee + a;
	System.out.println("The Company Name is " +cCompany);
	System.out.println("The total Number of employees in Company is " +cEmployee);
	System.out.println("the New Employees in the company is " +cNewEmployee);
	System.out.println("The Company Location is" +cLocation);
	}
}

class Manager2 extends Company1 {
	String mName;
	int mExperience;
	Manager2(String cCompany, int cEmployee,String cLocation,String mName,int mExperience){
    super(cCompany,cEmployee,cLocation);
    this.mName=mName;
    this.mExperience=mExperience;
	}
	void manager() {
		company();
		System.out.println("The manager Name is" +mName);
		System.out.println("The experience year of manager is" +mExperience);
			
	}
}
class TeamLead extends Manager2 {
	String tName;
	int tExperience;
	int tMembers;
	TeamLead(String tName, int tExperience, int tMembers, String cCompany, int cEmployee,String cLocation,String mName,int mExperience){
		super(cCompany,cEmployee,cLocation,mName,mExperience);
		this.tName=tName;
		this.tExperience=tExperience;
		this.tMembers=tMembers;	
	}
	void teamLead() {
	manager();	
	System.out.println("the teamlead name is " +tName);
	System.out.println("The experience of lead is" +tExperience);
	System.out.println("The number of members in team is" +tMembers);
	}
}
class Employee1 extends TeamLead {
	String eName;
	int eAge;
	String eDesignation;
	long eSalary;
	long eUpdatedSalary;
	private Scanner sc;
	
	Employee1(String eName, int eAge, String eDesignation, long eSalary,String tName, int tExperience, int tMembers, String cCompany, int cEmployee,String cLocation,String mName,int mExperience ){
	super(tName, tExperience, tMembers, cCompany, cEmployee, cLocation, mName, mExperience );
	this.eName=eName;
	this.eAge=eAge;
	this.eDesignation=eDesignation;
	this.eSalary=eSalary;
}
	
	void profile() {
		teamLead();
		sc = new Scanner(System.in);
		System.out.println("Enter the increment of the employee");
		int x=sc.nextInt();
		long eUpdatedSalary=eSalary + x;
		System.out.println("The employee name is" +eName);
		System.out.println("The age of the employee is "+eAge);
		System.out.println("the current Designation of employee is " +eDesignation);
		System.out.println("The salary of employee is " +eSalary);
		System.out.println("The updated Salary is " +eUpdatedSalary);
	}
}

public class MultiLevelInheritance {
public static void main (String [] args) {
 Employee1 emp=new Employee1("Yazh",20,"Developer",40000,"Kavin",10,15,"Tech Solutions",105,"Chennai","Mukesh",20);
 emp.profile();
}
}
