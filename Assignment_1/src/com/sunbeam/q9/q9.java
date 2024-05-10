package com.sunbeam.q9;

public class q9 {
//	Write a selection sort function to sort array and returns no of comparisions.
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		
		int ans = selectionSort(arr);
		System.out.println(ans);
		
	}
	
	static int selectionSort(int[]arr) {
		int count = 0;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return count;
		
		
	}
	
	
}
