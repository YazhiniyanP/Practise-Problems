package com.zukun.java;

import java.util.Scanner;

public class ParameterizedConstructor {
private static Scanner sc;

public static void main(String[] args) {
	Student stu=new Student();
	sc = new Scanner(System.in);
	System.out.println("Enter the mark");
	int e=sc.nextInt();
	System.out.println("Enter the  Tamil mark");
	int f=sc.nextInt();
	System.out.println("Enter the  English mark");
	int g=sc.nextInt();
	Student st=new Student();
	int x=stu.totalMark(01,"Yazh",90,85,96,e,f,g);
	System.out.println(x);
	float y=stu.medCutOff(01,"Yazh",90,85,96,e,f,g);
	System.out.println(y);
	float z=stu.engCutOff(01,"Yazh",90,85,96,e,f,g);
	System.out.println(z);
	int m=st.totalMark(01,"Yazh",90,85,96,e,f,g);
	System.out.println(m);
	float n=st.medCutOff(01,"Yazh",90,85,96,e,f,g);
	System.out.println(n);
	float o=st.engCutOff(01,"Yazh",90,85,96,e,f,g);
	System.out.println(o);
}
}
