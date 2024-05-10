package com.sunbeam.q3;

public class q3 {
	public static void main(String[] args) {
//		Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach
		
		int[]arr= {1,2,3,4,5,6,8,34,54,75,86,100};
		
		int totalC = lineaSearch(arr, 100);
		System.out.println(totalC);
		
		int totalCmp = binarySearch(arr, 100);
		System.out.println(totalCmp);
		
		
		
	}
	
	static int lineaSearch(int[]arr,int key) {
		int comparison = 0;
		for(int i = 0;i<=arr.length-1;i++) {
			comparison += 1;
			
			if(arr[i] == key) {
				
				return comparison;
			}
			
			
		}
		
		return -1;
	}
	
	static int binarySearch(int[]arr,int key) {
		int start = 0;
		int end = arr.length-1;
		
		int comparisons = -1;
		
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			comparisons +=1;
			if(arr[mid] == key) {
				return comparisons;
			}
			
			else if(key>arr[mid]) {
				start = mid+1;
				
			}
			else {
				end = mid-1;
			}
		}
		
		return -1;
	}

}
