package com;

public class TestMedicine{
	public static void main(String[] args){
	MedicineInfo m[] = new MedicineInfo[10];
	double i = Math.random()*4;
	int j = (int) i;
	System.out.println(j);
	switch(j){
	
	
case 1: m[0] = new MedicineInfo();
m[1] = new Tablet();
m[0].displayLabel();
m[1].displayLabel();break;

case 2: m[2] = new MedicineInfo();
m[3] = new Syrup();
m[2].displayLabel();
m[3].displayLabel();break;

case 3: m[4] = new MedicineInfo();
m[5] = new Ointment();
m[4].displayLabel();
m[5].displayLabel();break;

default: System.out.println("Invalid Choice");
}
	}
	}