package com.Day5;
import java.util.Scanner;

public class Ac {
	public static void main(String[] args) {
		int price=30000;
		Scanner a=new Scanner(System.in);
		System.out.println("is warranty available for AC");
		boolean isWarantee = a.nextBoolean();
		
		if(isWarantee == true) {
				System.out.println(price + 10000);
		}
		else {
			System.out.println(price - 5000);
		}
	}


}
