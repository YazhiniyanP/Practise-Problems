package com.zukun.java;

class Bicycle{
	String bType;
	int bVarities;
	String bRunType;
	Bicycle(String bType, int bVarities, String bRunType){
		this.bType=bType;
		this.bVarities=bVarities;
		this.bRunType=bRunType;
	}
	void bicycle() {
	System.out.println("The type of motor is" + bType);
	System.out.println("the varities available in company is" +bVarities);
	System.out.println("the running type is" +bRunType);
}
}
class Honda extends Bicycle{
	String hType;
	long hCost;
	Honda(String hType, long hCost,String bType, int bVarities, String bRunType){
		super(bType,bVarities,bRunType);
		this.hType=hType;
		this.hCost=hCost;
	}
	void honda() {
		bicycle();
		System.out.println("the name of the vehicle is " +hType);
		System.out.println("The cost of the vehicle is " +hCost);
	}
}
class Suzuki extends Bicycle{
	String sType;
	long sCost;
	Suzuki(String sType, long sCost,String bType, int bVarities, String bRunType){
		super(bType,bVarities,bRunType);
		this.sType=sType;
		this.sCost=sCost;
	}
	void suzuki() {
		bicycle();
		System.out.println("The name of the vehicle is " +sType);
		System.out.println("The Cost of the vehicle is " +sCost);
	}
}
    public class HeirachalInheritance {
	public static void main(String[] args) {
		Suzuki su=new Suzuki("Two Wheeler",60000,"TwoWheeler",6,"Petrol");
		su.suzuki();
		Honda ho=new Honda("Two Wheeler",70000,"TwoWheeler",6,"Petrol");
		ho.honda();
	}

}
