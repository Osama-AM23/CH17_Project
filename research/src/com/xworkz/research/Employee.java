package com.xworkz.research;

public class Employee {

	public String name;
	public String email;
	public int age;
	public long mobileNo;

	public Employee(String name, String email, int age, long mobileNo) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	
	public void displayDetails()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Email:"+this.email);
		System.out.println("Age:"+this.age);
		System.out.println("Mobile No:"+this.mobileNo);
	}

}
