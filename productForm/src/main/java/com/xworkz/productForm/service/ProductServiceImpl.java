package com.xworkz.productForm.service;

import com.xworkz.productForm.DTO.ProductDTO;

public class ProductServiceImpl implements ProductService {

	@Override
	public boolean checkAndSend(ProductDTO product) {
		
		boolean valid=true;
		
		if(product != null) {
			
			String companyName=product.getCompanyName();
			if(companyName!= null && companyName.length() >5 && companyName.length()<30) {
				System.out.println("Company Name is Valid");
			}else {
				System.err.println("Company name is In-Valid");
				valid=false;
			}
			
			String productName= product.getProductName();
			if(productName != null && productName.length() >5 && productName.length()<25) {
				System.out.println("Product Name is Valid");
			}else {
				System.err.println("Product Name is In-Valid");
				valid=false;
			}
			
			int productQuantity= product.getProductQuantity();
			if(productQuantity >0 && productQuantity <10) {
				System.out.println("Product Quantity is Valid");
			}else {
				System.err.println("Product Quantity is In-Valid");
				valid=false;
			}
			
			double productCost= product.getProductCost();
			if(productCost >100) {
				System.out.println("Product cost is Valid");
			}else {
				System.err.println("Product cost is In-Valid");
				valid=false;
			}
		}
		
		
		return valid;
	}
	
	

}
