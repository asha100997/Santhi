package com.Day5;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int a=input.nextInt();
		System.out.println("enter the second number");
		int b=input.nextInt();
		System.out.println("enter the third number");
		int c=input.nextInt();
		if(a>b&a>c) {
			System.out.println("a");
		}
		else if(b>c&b>a) {
			System.out.println("b");
		}
		else {
			System.out.println("c");
		}
		}
	

}
