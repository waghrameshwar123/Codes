package com;

import java.util.Scanner;

public class ClimbingStairs {
	
	    static int Stairs(int n)
	    {
	        if (n <= 1)
	            return n;
	        return Stairs(n - 1) + Stairs(n - 2);
	    }
	 
	  
	    static int countWays(int s)
	    {
	        return Stairs(s + 1);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the Number of stairs :");
	    int n=scanner.nextInt();
	    
	        System.out.println("Number of  ways to climb to the top  = " + countWays(n));

	}

}
