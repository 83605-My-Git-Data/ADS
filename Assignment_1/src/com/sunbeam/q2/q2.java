package com.sunbeam.q2;

import java.util.Scanner;

public class q2 {

//	Write a linear search algorithm to return index of last occurance of key.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[]arr = {1,2,3,4,5,4,3,2,4,1,4,5};
		
		System.out.println("Enter key to find last occ");
		int key = scanner.nextInt();
		
		
		 int ans = findLastOcc(arr,key);
		 System.out.println("Last occ of key"+ans);
		
	}
	
	static int findLastOcc(int[]arr,int key) {
		int index = -1;
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i] == key) {
				index = i;
				
			}
		}
		return index;
	}

}
