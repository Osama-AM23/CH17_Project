package com.xworkz.Inheritance.Runner;

import com.xworkz.Inheritance.Bird;
import com.xworkz.Inheritance.Chicken;

public class ChickenRunner {

	public static void main(String[] args) {
		
		Bird bird=new Bird();
		bird.type=" Heritage Breeds";
		bird.price=500;
		bird.weight=3.2;
		bird.height=3;
		bird.gender='F';
		bird.inch=2.67;
		bird.quality=true;
		bird.ownerOfChicken="osama";
		bird.color="white";
		bird.age=3;
		System.out.println("Type:"+bird.type);
		System.out.println("Price:"+bird.price);
		System.out.println("Weight:"+bird.weight);
		System.out.println("Height:"+bird.height);
		System.out.println("Gender:"+bird.gender);
		System.out.println("Inch:"+bird.inch);
		System.out.println("Quality:"+bird.quality);
		System.out.println("Owner:"+bird.ownerOfChicken);
		System.out.println("Color:"+bird.color);
		System.out.println("Age:"+bird.age);
		bird.show();
		System.out.println("----------------------");
		
		Chicken chicken1= new Chicken();
		chicken1.type=" Heritage Breeds";
		chicken1.price=500;
		chicken1.weight=3.2;
		chicken1.height=3;
		chicken1.gender='F';
		chicken1.inch=2.67;
		chicken1.quality=true;
		chicken1.ownerOfChicken="osama";
		chicken1.color="white";
		chicken1.age=3;
		System.out.println("Type:"+chicken1.type);
		System.out.println("Price:"+chicken1.price);
		System.out.println("Weight:"+chicken1.weight);
		System.out.println("Height:"+chicken1.height);
		System.out.println("Gender:"+chicken1.gender);
		System.out.println("Inch:"+chicken1.inch);
		System.out.println("Quality:"+chicken1.quality);
		System.out.println("Owner:"+chicken1.ownerOfChicken);
		System.out.println("Color:"+chicken1.color);
		System.out.println("Age:"+chicken1.age);
		chicken1.show();
		
	}

}
