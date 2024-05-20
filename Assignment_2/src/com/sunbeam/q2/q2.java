package com.sunbeam.q2;

import java.util.Arrays;

public class q2 {
	public static void main(String[] args) {
//		Modify the insertion sort algorithm to sort the array in descending order
		int[]arr = {45,25,98,14,67,11,3,37};
		
		System.out.println("Unsorted arr"+Arrays.toString(arr));
		
		insertion(arr);
		System.out.println("Descending arr"+Arrays.toString(arr));
	}
	
	static void insertion(int[]arr) {
		for(int i = 0;i<arr.length-2;i++) {
			for(int j = arr.length-1;j>i;j--) {
				if(arr[j]>arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
	}

}
