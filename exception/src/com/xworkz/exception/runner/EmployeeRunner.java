package com.xworkz.exception.runner;

import com.xworkz.exception.example.EmployeeService;
import com.xworkz.exception.example.InvalidEmployeeName;

public class EmployeeRunner {

	public static void main(String[] args) throws InvalidEmployeeName {

		EmployeeService employee = new EmployeeService();
		employee.saveDetails("Osama");
		employee.validSalary(30000);
		
	}

}
