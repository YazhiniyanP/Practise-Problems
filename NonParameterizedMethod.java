package com.zukun.java;

public class NonParameterizedMethod{

	public static void main(String[] args) {
  Calculation i=new Calculation();
  Calculation j=new Calculation();
  
  i.amount=1000;
  i.year=2;
  i.interestPercentage=0.75f;
  
   i.simpleInterest();
 
   j.amount=5000;
   j.year=3;
   j.interestPercentage=0.90f;
   
   j.simpleInterest();
	}

}
