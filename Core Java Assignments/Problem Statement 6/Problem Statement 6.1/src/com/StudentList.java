package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a =new ArrayList<String>();
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students :");
		n=sc.nextInt();
		System.out.println("Enter the student names :");
		
		for (int i=0; i<+n; i++) {
			
			a.add(sc.next());
			
		}
		System.out.println("student list :"+a);
		
		for (String string : a) {
			
			System.out.println("Enter the name of student you want to search :");
			String st = sc.next();
			int position = Collections.binarySearch(a,st);
			System.out.println("position of "+st+" is : "+position);
			
		}

	}

}
