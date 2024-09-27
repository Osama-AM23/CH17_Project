package com.xworkz.exception.example;

public class EmployeeService {

	public void saveDetails(String name) throws InvalidEmployeeName {

		System.out.println("save Details in Employee Service with String");

		if (name == null || name.equals("")) {
			
			System.out.println("program will be not Continue");

			throw new InvalidEmployeeName();
		}
		System.out.println("Program will be executed");
	}
	
	public void validSalary(int salary) {
		System.out.println("Valid salary in Employee Service with int");
		
		if(salary >0 && salary >30000) {
			System.out.println("Invalid Salary, Program will be not continue");
			throw new InvalidEmployeeSalary();
		}
		else {
			System.out.println("Valid Salary, will be continue");
		}
	}

}
