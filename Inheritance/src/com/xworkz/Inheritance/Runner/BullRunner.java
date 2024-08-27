package com.xworkz.Inheritance.Runner;

import com.xworkz.Inheritance.Animal;
import com.xworkz.Inheritance.Bull;

public class BullRunner {

	public static void main(String[] args) {
		 
		Animal animal1=new Animal();
		animal1.type="Cattle Breeds";
		animal1.gender='M';
		animal1.price=100000;
		animal1.color="white";
		System.out.println("Bull Type:"+animal1.type);
		System.out.println("Gender:"+animal1.gender);
		System.out.println("Price:"+animal1.price);
		System.out.println("Color:"+animal1.color);
		animal1.information();
		System.out.println("-------------------------");
		
		Bull bull1=new Animal();
		bull1.type="Wild Bulls";
		bull1.gender='F';
		bull1.price=150000;
		bull1.color="Brown";
		System.out.println("Bull Type:"+bull1.type);
		System.out.println("Gender:"+bull1.gender);
		System.out.println("Price:"+bull1.price);
		System.out.println("Color:"+bull1.color);
		bull1.information();
		
	}

}
