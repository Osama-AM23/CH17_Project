package com.xworkz.example.internal;
//Example of OverLoading
public class CabDriver {

	private String name;
	private int age;
	private int salary;

	public CabDriver() {
		System.out.println("No-Args Constructor");
	}
	
	public CabDriver(String name) {
		this.name=name;
		System.out.println("One String-Args constructor");
	}
	
	public CabDriver(String name, int age, int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println("Three Args Constructor");
	}

}
