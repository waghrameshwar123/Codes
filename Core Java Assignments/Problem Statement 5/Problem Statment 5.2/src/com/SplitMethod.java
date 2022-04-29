package com;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= (" 23  +  45  -  (  343  /  12  ) ");
		String[] w = str.split("\\s");
		
		for(String w1:w){  
			System.out.println(w1); 
			
		}
	}

}
