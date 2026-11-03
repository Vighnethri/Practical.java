package com.java.TestCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertHotel {
	
	public static void addHotel()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter hotel name?");
		String name=scanner.next();
		System.out.println("enter room type:");
		String room=scanner.next();
		System.out.println("enter the price :");
		float price=scanner.nextFloat();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hotel", "root","apple1105_");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("SELECT * FROM hotel;");
		}
		catch (Exception e) {
			
		}
	}

}
