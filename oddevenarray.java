package com.p1;

public class oddevenarray {

	public static void main(String[] args) {
         int arr[]={20,10,5,38,19};
         int even=0,odd=0;
         for(int num:arr){
        	 if(num%2==0)
        		 even++;
        	 else
        		 odd++;
         }
         System.out.println("Even count:"+even);
         System.out.println("Odd count:"+odd);

	}

}
