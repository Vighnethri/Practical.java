package com.java.test;

import java.util.Scanner;

public class ArrayinJava {
	
	
	    public static void main(String[] args) {

	        String str = "HELLO";

	        Scanner sc = new Scanner(System.in);

	        int[] a = new int[str.length()];

	        System.out.println("Enter " + str.length() + " integer values:");

	        for (int i = 0; i < str.length(); i++) {
	            a[i] = sc.nextInt();
	        }

	        System.out.println("Output:");

	        for (int i = 0; i < str.length(); i++) {
	            System.out.println(str.charAt(i) + " = " + a[i]);
	        }

	        sc.close();
	    }
	

}
