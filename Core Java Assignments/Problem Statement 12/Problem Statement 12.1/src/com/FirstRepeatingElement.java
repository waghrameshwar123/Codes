package com;

import java.util.*;

public class FirstRepeatingElement {

    static void printFirstRepeating(int arr[]){
       
        int min = -1;
 
        HashSet<Integer> set = new HashSet<>();
 
       for (int i=arr.length-1; i>=0; i--){
            
            if (set.contains(arr[i]))
                min = i;
            else   
                set.add(arr[i]);
        }
 
       
        if (min != -1)
          System.out.println("The first repeating element is :" + arr[min]);
        else
          System.out.println("There are no repeating elements");
    }
 
    
    public static void main (String[] args){
        int arr[] = {1, 2, 3, 10, 4, 4, 5, 7, 8 };
        printFirstRepeating(arr); 
    }
}


