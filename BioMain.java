package com.zukun.java;

import java.util.Scanner;

public class BioMain {
String name;
int rollNo;
String degree;
float cgpa;
char grade;
String college;
private static Scanner scanner;

	public static void main(String[] args) {
		Bio b=new Bio();
		Bio c=new Bio();
		Bio d=new Bio();
		
scanner = new Scanner(System.in);
System.out.println("Enter the name of the student");
String name=scanner.nextLine();
System.out.println("Enter the degree of the student");
String degree=scanner.nextLine();
System.out.println("Enter the college name");
String college=scanner.nextLine();
System.out.println("Enter the CGPA of Student");
float cgpa=scanner.nextFloat();
System.out.println("Enter the roll number of the person");
int rollNo =scanner.nextInt();


b.name=name;
b.rollNo=rollNo;
b.degree=degree;
b.cgpa=cgpa;
b.college=college;

scanner = new Scanner(System.in);
System.out.println("Enter the name of the student");
String name1=scanner.nextLine();
System.out.println("Enter the degree of the student");
String degree1=scanner.nextLine();
System.out.println("Enter the college name");
String college1=scanner.nextLine();
System.out.println("Enter the CGPA of Student");
float cgpa1=scanner.nextFloat();
System.out.println("Enter the roll number of the person");
int rollNo1 =scanner.nextInt();
c.name=name1;
c.rollNo=rollNo1;
c.degree=degree1;
c.cgpa=cgpa1;
c.college=college1;


scanner = new Scanner(System.in);
System.out.println("Enter the name of the student");
String name2=scanner.nextLine();
System.out.println("Enter the degree of the student");
String degree2=scanner.nextLine();
System.out.println("Enter the college name");
String college2=scanner.nextLine();
System.out.println("Enter the CGPA of Student");
float cgpa2=scanner.nextFloat();
System.out.println("Enter the roll number of the person");
int rollNo2 =scanner.nextInt();

d.name=name2;
d.rollNo=rollNo2;
d.degree=degree2;
d.cgpa=cgpa2;
d.college=college2;

b.profile();
b.grade();
c.profile();
c.grade();
d.profile();
d.grade();
/*
 * b.name="Yazh";
b.rollNo=44;
b.degree="M Tech";
b.cgpa=8.7f;
b.college="Anna University";
b.profile();
b.grade();
 
c.name="Vijay";
c.rollNo=36;
c.degree="M Tech";
c.cgpa=7.6f;
c.college="Anna University";
c.profile();
c.grade();

d.name="Suri";
d.rollNo=40;
d.degree="M Tech";
d.cgpa=3.6f;
d.college="Anna University";
d.profile();
d.grade();
	*/
}

}
