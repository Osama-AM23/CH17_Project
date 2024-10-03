package com.xworkz.enumExamples.dto;

import com.xworkz.enumExamples.enums.ProductType;

public class CustomerDTO {
	
	private String name;
	private String eMail;
	private ProductType productType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	

}
