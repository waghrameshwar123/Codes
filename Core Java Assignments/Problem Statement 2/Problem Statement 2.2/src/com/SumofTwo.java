package com;

import java.util.Scanner;

public class SumofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 13, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First number :");
		num1 = sc.nextInt();
		System.out.println("Enter a Second number :");
		num2 = sc.nextInt();
		
		for(int i = 0; i <= count+1; i++) {
			System.out.println(num1+ "");
			
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

	}

}
