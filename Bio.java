package com.zukun.java;

public class Bio {
	String name;
	double rollNo;
	String degree;
	float cgpa;
	//char grade;
	String college;
	void profile() {
		System.out.printf("Name is " + name + " Roll No is " + rollNo + " Degree is " + cgpa + " College is " + college + " and grade is ");
	}
	void grade(){
		System.out.println((cgpa>9.0)? "A" : (cgpa>8.0)? "B" :(cgpa>7.0)? "C" : (cgpa>6.0)? "D" : (cgpa>5.0)? "E" : "FAIL");
		
	}
}
