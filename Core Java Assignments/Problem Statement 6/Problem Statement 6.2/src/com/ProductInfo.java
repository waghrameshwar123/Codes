package com;

import java.util.Hashtable;
import java.util.Scanner;

public class ProductInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		System.out.println("Enter the product id and name :");
		
		for (int i = 0; i <3; i++) {
			
			hashTable.put(sc.next(), sc.next());
		}
		System.out.println("The product list is :");
		System.out.println(hashTable);
		System.out.println("Enter the removable product id :");
		String id=sc.next();
		hashTable.remove(id);
		System.out.println("Item removed :");
		System.out.println("The product list is :");
		System.out.println(hashTable.toString());
		System.out.println("Enter the product id to be serched :");
		
		String str=sc.next();
		
		if (hashTable.containsKey(str)) {
			
			System.out.println(hashTable.get(str));
			
		}
		else {
			System.out.println("do not exist");
		}

	}

}
