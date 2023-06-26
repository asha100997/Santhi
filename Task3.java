package com.Day5;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=input.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
	
		else {
			System.out.println("odd");
		}
		}
}
