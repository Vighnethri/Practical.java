package com.java.test;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class classObject {
	
	public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Vighnethri";
        s1.age = 19;

        s1.display();
    }

}
