package com.p1;
import java.util.Scanner;


public class sumavg {
public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1=sc.nextInt();
	System.out.println("Enter second number:");
	int num2=sc.nextInt();
	int sum=num1+num2;
	double avg=sum/2;
	System.out.println("sum:"+sum);
	System.out.println("average:"+avg);
	sc.close();

	
}
}
