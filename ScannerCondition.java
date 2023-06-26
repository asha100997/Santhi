package com.Day5;

import java.util.Scanner;

public class ScannerCondition {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input.nextInt();
		if(num>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}
		
		
	}
}
