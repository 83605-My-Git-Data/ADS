package com.sunbeam.q7;

public class q7 {
	
//	 find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3

	public static void main(String[] args) {
		
		 int[]arr= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		 
		 int ans = nonRepeatingEle(arr);
		 
		 System.out.println(ans);
		
	}
	
	static int nonRepeatingEle(int[]arr) {
		 boolean flag;
	        for(int i = 0 ;i<arr.length-2;i++) {
	            flag = false;
	            int var  =  arr[i];
	            for(int j = i+1;j<arr.length;j++) {
	                if(var == arr[j]) {
	                    flag = true;
	                    break;
	                }


	            }
	            if(flag!= true){
	                return var;
	            }



	        }
	        return -1;
	    }

}
