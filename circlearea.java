package com.p1;
import java.util.Scanner;


public class circlearea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius:");
		double radius=sc.nextDouble();
		double area=3.14*radius*radius;
		System.out.println("Area:"+area);
		sc.close();

	}

}
