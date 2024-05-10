package com.sunbeam.q6;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
//		6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//		not found, return -1.

		Scanner scanner = new Scanner(System.in);
		
		int[]arr = {1,2,3,4,5,4,3,2,4,1,4,5};
		
		System.out.println("Enter key: ");
		int key = scanner.nextInt();
		
		System.out.println("which occurance you want to find");
		int occ = scanner.nextInt();
		
		
		int ans = findOcc(arr, key, occ)
		;
		System.out.println(occ+" th occurance at index "+ ans);
		
		
	}
	
	static int findOcc(int[]arr,int key,int occ) {
		int count = 0;
		
		for(int i = 0 ;i<arr.length-1;i++) {
			if(arr[i] == key) {
				count++;
				
			}
			
			if(count == occ) return i;
			
			
		}
		return -1;
	}

}
