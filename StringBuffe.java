package com.zukun.java;

public class StringBuffe {
		public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer();
	        sb.append("Hello");
	        System.out.println(sb); 
	        
	        StringBuffer sb1 = new StringBuffer("This is ");
	        sb1.append("world!");
	        System.out.println(sb1); 
	        
	        StringBuffer sb2 = new StringBuffer(sb1);
	        sb2.insert(6, "beautiful ");
	        System.out.println(sb2); 
	         
	        StringBuffer sb3 = new StringBuffer("Zukun java Training");
	        sb3.replace(5,9,"Super");
	        System.out.println(sb3); 
	        
	        StringBuffer sb4 = new StringBuffer("Zukun java Training");
	        sb4.append("Chennai");
	        sb4.delete(2, 8);
	        System.out.println(sb4);
	        
	        StringBuffer sb5 = new StringBuffer(sb4);
	        sb5.reverse();
	        System.out.println(sb5);
	        
	        StringBuffer sb6 = new StringBuffer(20);
	        System.out.println(sb6.capacity());
	        
	        StringBuffer sb7 = new StringBuffer("I had been enrolled in Java Full Stack Development");
	        sb6.append("Yazh");
	        System.out.println(sb7.capacity());
	        
		}
}
