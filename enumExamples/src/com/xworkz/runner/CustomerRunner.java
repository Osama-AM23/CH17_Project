package com.xworkz.runner;

import com.xworkz.enumExamples.dto.CustomerDTO;
import com.xworkz.enumExamples.enums.ProductType;

public class CustomerRunner {

	public static void main(String[] args) {
		
		CustomerDTO customer= new CustomerDTO();
		customer.setName("Osama");
		customer.seteMail("osama@gmail.com");
		customer.setProductType(ProductType.FURNITURE);
		System.out.println("Customer Name:"+customer.getName()+", "+ "Email:"+customer.geteMail()+", "+"Product Type:"+customer.getProductType());

	}

}
