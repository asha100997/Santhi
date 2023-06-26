package com.Day5;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int age=Integer.parseInt(args[0]);
	    if(age>=18) {
	    	System.out.println("eligible tovote");
	    }
	    else {
	    	System.out.println("not eligible tovote");
	    }
	}

}
