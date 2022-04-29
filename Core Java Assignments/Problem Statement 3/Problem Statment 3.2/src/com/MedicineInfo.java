package com;

public class MedicineInfo{
	public void displayLabel(){
//	System.out.println("Company : Zendu PVT");
//	System.out.println("Address : Pune");
	}
	}
class Tablet extends MedicineInfo{	 
	public void displayLabel(){
		System.out.println("Tablet : SUMO Cold");
		System.out.println("store in a cool dry place");
	}
}
class Syrup extends MedicineInfo{
	public void displayLabel(){
		System.out.println("Syrup : W.H.O.");
		System.out.println("Consumption as directed by doctor");
	}
	}
class Ointment extends MedicineInfo{
	public void displayLabel(){
		System.out.println("Ointment : Zendu Baam");
		System.out.println("for external use only");
}
}