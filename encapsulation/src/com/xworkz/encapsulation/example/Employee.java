package com.xworkz.encapsulation.example;
// example of fully encapsulated class
public class Employee {
	
	// private data members
	private String name;
	private int age;
	private double salary;

	//Public get method of name
	public String getName() {
		return name;
	}

	// public set method of Name
	public void setName(String name) {
		this.name = name;
	}

	//Public get method of Age
	public int getAge() {
		return age;
	}

	// Public set method of Age
	public void setAge(int age) {
		this.age = age;
	}

	//Public get method of Salary
	public double getSalary() {

		return salary;
	}

	// Public set method of Salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
