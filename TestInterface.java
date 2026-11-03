package com.java.test;

import java.util.Scanner;

interface Gmail{
	public void name();
	public void password();
	public void ziplock();
}

interface Sharda
{
	int systemID();
	String studName();
}
class UserMail implements Gmail,Sharda
{
	 static Scanner scanner=new Scanner(System.in);
	
	public void name() {
		
		System.out.println("Enter name");
		String n=scanner.next();
		System.out.println(n);
		
	}
	public void password() {
		
	}
	@Override
	public int systemID() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String studName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void ziplock() {
		// TODO Auto-generated method stub
		
	}
}
public class TestInterface {
	public static void main(String[] args) {
		
		
	}

}
