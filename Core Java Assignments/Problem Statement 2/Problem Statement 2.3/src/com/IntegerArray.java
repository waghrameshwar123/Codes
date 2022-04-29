package com;
import java.util.*;
import java.util.Arrays;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum; 
		sum = 0;
		int average=0;
//		
		int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		int min = A[0];
		
		//sum of elements from index 0 to 14 and stores it at element 15
		System.out.println("sum of elements from index 0 to 14 and stores it at element 15");
		System.out.println("average of all numbers and stores it at element 16");
		System.out.println("smallest value from the array and stores it at element 17");
		for (int index = 0; index < A.length-3; index++ ) 
		{ 
		   	 sum = sum + A[ index ];
			average = sum/2;
			if(min>A[index]){
				min=A[index];
			}
				
			 
		} 
		 
		A[ A.length - 3 ] = sum;
		A[ A.length - 2 ] = average;
		A[ A.length - 1 ] = min;
		
		
		System.out.println(Arrays.toString(A));
		
//		//average of all numbers and stores it at element 16
//		System.out.println("average of all numbers and stores it at element 16");
//        average = sum / A.length;
//        A[ A.length - 2 ] = average;
//         
//        System.out.println(Arrays.toString(A));
//        
//       //smallest value from the array and stores it at element 17
//        System.out.println("smallest value from the array and stores it at element 17");
//        int min = A[0];
//        
//        for (int j =0; j<A.length;j++)
//        	if(A[j]<min)
//        		min = A[j];
//        
//        A[ A.length - 1 ] = min;
//        
//        System.out.println(Arrays.toString(A));

	}

}
