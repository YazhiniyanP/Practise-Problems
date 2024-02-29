package com.zukun.java;

 class Student {
int idNo;
String name;
int phyMark;
int cheMark;
int bioMark;
int mathMark;

public int totalMark(int idNo, String name, int phyMark, int cheMark, int bioMark, int mathMark, int engmark, int tamMark){
	this.idNo=idNo;
	this.name=name;
	this.phyMark=phyMark;
	this.cheMark=cheMark;
	this.bioMark=bioMark;
	this.mathMark=mathMark;
	return phyMark+cheMark+bioMark+mathMark;
}
	
  public float medCutOff(int idNo, String name, int phyMark, int cheMark, int bioMark, int mathMark, int engmark, int tamMark) {
	return (phyMark+bioMark+cheMark)/4;
}
	
 public float engCutOff(int idNo, String name, int phyMark, int cheMark, int bioMark, int mathMark, int engmark, int tamMark) {
	return (mathMark+phyMark+cheMark)/3;
}
	
}

