package com.xworkz.exception.runner;

import com.xworkz.exception.example.CustomerService;
import com.xworkz.exception.example.InvalidEmail;

public class CustomerServiceRunner {

	public static void main(String[] args) throws InvalidEmail {
		
		CustomerService service= new CustomerService();
		service.saveEmail("osama23@gmail.com");
		service.acceptPrice(50);

	}

}
