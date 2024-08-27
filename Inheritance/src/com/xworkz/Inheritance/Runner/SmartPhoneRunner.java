package com.xworkz.Inheritance.Runner;

import com.xworkz.Inheritance.CommunicationDevice;
import com.xworkz.Inheritance.SmartPhone;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		
		CommunicationDevice communicationdevice1= new CommunicationDevice();
		communicationdevice1.brand="Apple";
		communicationdevice1.model="14 Series";
		communicationdevice1.price=60000;
		communicationdevice1.color="StarLight";
		System.out.println("Brand :"+communicationdevice1.brand);
		System.out.println("Model:"+communicationdevice1.model);
		System.out.println("Price :"+communicationdevice1.price);
		System.out.println("Color :"+communicationdevice1.color);
		communicationdevice1.info();
		System.out.println("----------");
		
		SmartPhone smartphone1=new SmartPhone();
		smartphone1.brand="Samsung";
		smartphone1.model="S24 series";
		smartphone1.price=94000;
		smartphone1.color="titanium black";
		System.out.println("Brand:"+smartphone1.brand);
		System.out.println("Model:"+smartphone1.model);
		System.out.println("Price:"+smartphone1.price);
		System.out.println("Color:"+smartphone1.color);
		smartphone1.info();
		
		
	}

}
