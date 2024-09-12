package com.xworkz.research;
//Example of LocalDate and LocalDateTime

import java.time.LocalDate;//import the java.time.localDate
import java.time.LocalDateTime;//import the java.time.localDateTime

public class Date {

	public static void main(String[] args) {// main method
		
		System.out.println("--------LocalDate--------");

		// current date syntax
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date :" + currentDate);

		// Past Date syntax
		LocalDate pastDate = currentDate.minusYears(5);
		System.out.println("Past Date :" + pastDate);

		// Future date syntax
		LocalDate futureDate = currentDate.plusYears(5);
		System.out.println("Future Date:" + futureDate);
		System.out.println("--------LocalDateTime--------");
		
		//Current Date Time Syntax
		LocalDateTime currentDateTime= LocalDateTime.now();
		System.out.println("Current Date Time :"+currentDateTime);
		//Past Date Time Syntax
		LocalDateTime pastDateTime= currentDateTime.minusYears(8);
		System.out.println("Past Date Time :"+pastDateTime);
		//Future Date Time Syntax
		LocalDateTime futureDateTime= currentDateTime.plusYears(8);
		System.out.println("Future Date Time :"+futureDateTime);
	}
}
