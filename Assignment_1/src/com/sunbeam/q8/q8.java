package com.sunbeam.q8;

import java.util.Arrays;

public class q8 {
	
//	 to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
//	 no. of ele's less than or equal to x (including x).
//	 Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4
//	

	public static void main(String[] args) {
		
		int[]arr = {10,20,15,3,4,4,1};
		
		int no  = 15;
		
		int ans = rankCal(arr, no);
		System.out.println("Rank of 15 is "+ans);
		
		//{1,3,4,4,10,15,20}
		
		// 0 1 2 3  4   5  6
	}
	
	static int rankCal(int[]arr,int no) {
		int count=0;
		
		 Arrays.sort(arr);
		 
		 for(int i = 0 ;i<arr.length-1;i++) {
			 if(arr[i]<= no ) {
				 
				 count++;
			 }
			 
		 }
		 
		 return count;
		
	}

}
