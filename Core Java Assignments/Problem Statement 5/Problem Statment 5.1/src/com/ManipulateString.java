package com;

public class ManipulateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "JAVA is Simple";
		
		System.out.println(str.toUpperCase()); //UpperCase
		
		System.out.println(str.toLowerCase()); //LowerCase
		
		
		String[] s1=str.split("\\s");	//1st words of letter
		for(String w:s1){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		System.out.println(" ");
		
		String[] s2=str.split("\\s"); // Change order 
		for(String w:s2){  
			System.out.println(w); 
		}
		
		//Reverse
		StringBuilder input = new StringBuilder();
		input.append(str);
		input.reverse();
		System.out.println(input);
		
		
		//Total Length
		System.out.println("length of string " + str.length());
	}

}
