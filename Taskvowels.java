package com.Day5;

import java.util.Scanner;

public class Taskvowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = input.next();
		if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o")
				|| word.contains("u")) {
			System.out.println("yes");
		} 
		else {
			System.out.println("no");

		}
	}

}
