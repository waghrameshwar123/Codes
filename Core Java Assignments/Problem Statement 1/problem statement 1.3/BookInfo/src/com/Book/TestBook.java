package com.Book;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the Book title");
		String booktitle=scan.nextLine();
		
		System.out.println("Enter the Book price");
		double price=scan.nextDouble();
		scan.nextLine();
		
		Book book = new Book();
		book.setBook_title(booktitle);
		book.setBook_price(price);
		System.out.println("Book Details");
		System.out.println("Book Title :"+book.getBook_title());
		System.out.println("Book Price :"+book.getBook_price());
		

	}

}
