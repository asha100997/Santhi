package com.Day5;
import java.util.Scanner;


public class Task6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the mark");
		int a=input.nextInt();
		if(a>=90&a<=100) {
			System.out.println("S GRADE");
		}
		else if(a>=80&a<90) {
			System.out.println("A GRADE");
		}
		else if(a>=70&a<80) {
			System.out.println("B GRADE");
		}
		else if(a>=60&a<70) {
			System.out.println("C GARDE");
		}
		else if(a>=50&a<60) {
			System.out.println("D GRADE");
		}
		else if(a<50) {
			System.out.println("FAIL");
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}

}
