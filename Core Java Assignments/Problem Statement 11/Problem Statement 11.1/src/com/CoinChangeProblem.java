package com;

import java.util.Scanner;
import java.util.Vector;

public class CoinChangeProblem {

	    static int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
	    static int n = coins.length;
	  
	    static void findMin(int V){
	   	        Vector<Integer> ans = new Vector<>();
	  
	       	        for (int i = n - 1; i >= 0; i--)
	        {
	           
	            while (V >= coins[i]) 
	            {
	                V -= coins[i];
	                ans.add(coins[i]);
	            }
	        }
	  
	        
	        for (int i = 0; i < ans.size(); i++){
	            System.out.print(" " + ans.elementAt(i));
	                
	            
	        }
	        System.out.println("\n The minimum number of notes or coins is "+ans.size());
	    }
	  
	   
	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	    	   System.out.println("Enter the Amount :");
	    	   int n = sc.nextInt();
	        
	    	   
	        System.out.print(" Following is minimal amount of change for " + n + ": ");
	        findMin(n);
	    }

	}

