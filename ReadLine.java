package com.java.test;

import java.util.Scanner;

public class ReadLine {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String text = sc.nextLine();

	        System.out.println("You entered: " + text);

	        sc.close();
	    }
}
