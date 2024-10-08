package com.xworkz.research;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];

		
		employees[0] = new Employee("chethan", "chethan@gmail.com", 22, 8548866698L);
		employees[1] = new Employee("varun", "varun@gmail.com", 21, 9380284219L);
		employees[2] = new Employee("naganna", "naganna@gmail.com", 24, 9793727798L);
		employees[3] = new Employee("likhi", "likhi@gmail.com", 22, 7895671234L);
		employees[4] = new Employee("akhil", "akhil@gmail.com", 23, 8768762335L);

		// Use foreach loop to print details of each employee
		for (Employee e : employees) {
			e.displayDetails();
		}
	}

}
