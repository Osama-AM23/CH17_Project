package com.xworkz.example.internal;
//example of InstanceBlock
public class Book {

	String name;
	int price;

	{
		name = "Think & Grow Rich";
		price = 500;
		System.out.println("Name " + name);
		System.out.println("Price " + price);
	}
	//constructor
	public Book() {
		System.out.println("Creating a Book with No-Agrs");
	}
	
	public static void main(String[] main)
	{
		System.out.println("Running a main method");
		System.out.println("--------------");
		Book book= new Book();
		System.out.println("--------------");
		Book book2= new Book();
	}

}
