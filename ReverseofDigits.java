package com.java.test;

import java.util.Scanner;

class Test {

    public int calculateSoD(int num) {

        int sum = 0;

        if (num == 0) {
            System.out.println("Reverse of number is = 0");
        }
        else if (num < 0) {
            System.out.println("Please enter a positive number");
        }
        else {
            for (; num > 0;) {

                int rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;
            }

            System.out.println("Reverse of number is = " + sum);
        }

        return sum;
    }
}



public class ReverseofDigits {
	
	 public static void main(String[] args) {

	        Test test = new Test();

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number:");
	        int a = scanner.nextInt();

	        test.calculateSoD(a);

	        scanner.close();
	    }
}
