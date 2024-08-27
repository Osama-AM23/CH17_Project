package com.xworkz.Inheritance.Runner;

import com.xworkz.Inheritance.Halwa;
import com.xworkz.Inheritance.Sweet;

public class HalwaRunner {

	public static void main(String[] args) {
		
		Sweet sweet1= new Sweet();
		sweet1.name="Beetroot Halwa";
		sweet1.quantity=1;
		sweet1.price=300;
		System.out.println("Name:"+sweet1.name);
		System.out.println("Quantity:"+sweet1.quantity);
		System.out.println("Price:"+sweet1.price);
		sweet1.details();
		System.out.println("------------------");
		
		Halwa halwa1= new Halwa();
		halwa1.name="Tahin Halva";
		halwa1.quantity=1;
		halwa1.price=450;
		System.out.println("Name:"+halwa1.name);
		System.out.println("Quantity:"+halwa1.quantity);
		System.out.println("Price:"+halwa1.price);
		halwa1.details();
		
		
	}

}
