package com.sunbeam.q1;

import java.util.Arrays;
import java.util.Iterator;

public class q1 {
//	1. Write a insertion sort function to sort array and returns no of comparisions.
	public static void main(String[] args) {
		int[]arr = {55,44,22,66,11,33};

		
		System.out.println("Unsorted array"+Arrays.toString(arr));
		
		
		int res = returnComparisonOfInsertion(arr);
		System.out.println("Total Comparisons"+res);
		System.out.println("Sorted arr"+Arrays.toString(arr));
		
	}
	

	
	static int returnComparisonOfInsertion(int[]arr) {
		int count = 0;
	
		for(int i = 1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			
			
			while(j>=0){
				count++;
			if(arr[j]>temp) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
	}
		return count;
	}
}
	
	
	
	
	


