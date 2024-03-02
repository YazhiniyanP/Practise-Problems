package com.zukun.java;

import java.util.Scanner;

public class StringBuilde {
	private static Scanner sc;

	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb); 
        
        StringBuilder sb1 = new StringBuilder("This is ");
        sb1.append("world!");
        System.out.println(sb1); 
        
        sc = new Scanner(System.in);
        System.out.println(" ur name is");
        sc.next();
        
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.insert(6, "beautiful ");
        System.out.println(sb2); 
         
        StringBuilder sb3 = new StringBuilder("Zukun java Training");
        sb3.replace(5,9,"Super");
        System.out.println(sb3); 
        
        StringBuilder sb4 = new StringBuilder("Zukun java Training");
        sb4.append("Chennai");
        sb4.delete(2, 8);
        System.out.println(sb4);
        
        StringBuilder sb5 = new StringBuilder(sb4);
        sb5.reverse();
        System.out.println(sb5);
        
        StringBuilder sb6 = new StringBuilder();
        System.out.println(sb6.capacity());
        
        StringBuilder sb7 = new StringBuilder(20);
        System.out.println(sb7.capacity());
        
        StringBuilder sb8 = new StringBuilder("I had been enrolled in Java Full Stack Development");
        sb8.append("Yazh");
        System.out.println(sb8.capacity());
        
	}
}
