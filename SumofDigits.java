package com.java.test;

import java.util.Scanner;

class test{
	public int calculateSoD(int num)
	{
		int sum=0;
		for(;num>0;)
		{
			
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			System.out.println("sum="+sum);
		}
		
		return sum;
	}
}

public class SumofDigits {

public static void main(String[] args) {
	
	test test = new test();
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter the number");
	int a=scanner.nextInt();
	
	test. calculateSoD(a);
	scanner.close();
}
}
