package com.sunbeam.q5;

public class q5 {
	
//	Implement binary search algorithm if array is sorted in descending order

	public static void main(String[] args) {
		
		int[]arr = {100,86,75,54,34,8,6,5,4,3,2,1};
		int key = 54;
		
		int index = binarySearch(arr,key);
		
		
		if(index!= -1) {
			System.out.println("found");
			
		}
		else {
			System.out.println("ENF");
		}
		
		

	}
	
	static int binarySearch(int[]arr,int key) {
		int start = 0;
		int end = arr.length-1;
		
		while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(key >arr[mid]){
                
                end = mid-1;
            }
            else{
            	start = mid+1;
               
            }
        }
        return -1;
	}

}
