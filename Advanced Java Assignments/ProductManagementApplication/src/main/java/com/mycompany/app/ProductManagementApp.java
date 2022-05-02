package com.mycompany.app;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mycompany.domain.Product;
import com.mycompany.service.ProductService;

public class ProductManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductService es = new ProductService();
		int pid;
		String pname;
		int pprice;
		String con="";
		int choice;
		String result;
		
		do {
			System.out.println("1:Add, 2: Delete, 3: Update, 4:Display All");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
		
			switch(choice) {
			case 1: System.out.println("Enter the id");
					pid = sc.nextInt();
					System.out.println("Enter the name");
					pname = sc.next();
					System.out.println("Enter the price");
					pprice = sc.nextInt();
					Product pro = new Product(pid, pname, pprice);
					result = es.storeProduct(pro);
					System.out.println(result);
					break;
			case 2:	System.out.println("Enter the id");
					pid = sc.nextInt();
					result = es.deleteProductInfo(pid);
					System.out.println(result);
					break;
					 
			case 3:System.out.println("Enter the id");
					pid = sc.nextInt();
//					System.out.println("Enter the name");
//					pname = sc.next();
					System.out.println("Enter the price");
					pprice = sc.nextInt();
					Product pro1 = new Product();
					pro1.setPid(pid);
//					pro1.setPname(pname);
					pro1.setPprice(pprice);
					result = es.updateProductInfo(pro1);
					System.out.println(result);
					break;
			case 4:List<Product> listOfEmp = es.getAllProduct();
					Iterator<Product> li = listOfEmp.iterator();
					while(li.hasNext()) {
						Product e = li.next();
						System.out.println(e);
					}
					break;
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue?");
			con = sc.next();
		}while(con.equals("y"));
		System.out.println("Thank you visit again!");
	}

	}
