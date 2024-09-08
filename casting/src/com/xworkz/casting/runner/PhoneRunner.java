package com.xworkz.casting.runner;

import com.xworkz.casting.internal.IPhone;
import com.xworkz.casting.internal.Osama;
import com.xworkz.casting.internal.Phone;

public class PhoneRunner {

	public static void main(String[] args) {
		
		Osama osama= new Osama();
		Phone phone= new Phone();
		IPhone iphone= new IPhone();
		osama.user(phone);
		System.out.println("--------------");
		osama.user(iphone);
	}

}
