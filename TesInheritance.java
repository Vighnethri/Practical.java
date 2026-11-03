package com.java.test;

class Car{
	int a=10;
	public void fourtyres() {
		System.out.println("I have fourtyres");	
		}
	
}

class Santro extends Car{
	int b=20;
	public void powerWindows() {
		System.out.println("I have powerWindows");
	}
}

class BMW extends Santro{
	public void airBags() {
		System.out.println("I have airBags");
		System.out.println("Without Object="+(a+b));
	}
}
public class TesInheritance {
	
	public static void main(String[] args) {
		
		//Car car=new Car();
		//car.fourtyres();
		
		//Santro santro=new Santro();
		//santro.powerWindows();
		
		BMW bmw=new BMW();
		bmw.airBags();
		bmw.fourtyres();
		bmw.powerWindows();
		
		
		
	}

}
