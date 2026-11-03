package com.java.test;

class User
{
	 int x=10;
	 public User() {
		 System.out.println("hi from constructor block");
	 }
	 public void show() {
		 System.out.println("hi from show");
	 }
}

class newUser extends User{
	 
	 public void show() {
		 System.out.println("hi from show from child class");
	 }
}
 
public class TestOverload {
	
	public static void main(String[] args){
		User newUser;
		newUser= new newUser();
		System.out.println(newUser.x);
		newUser.show();
		
		
	}

}
