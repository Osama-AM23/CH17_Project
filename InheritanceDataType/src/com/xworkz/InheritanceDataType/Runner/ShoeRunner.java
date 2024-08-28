package com.xworkz.InheritanceDataType.Runner;

import com.xworkz.InheritanceDataType.Divya;
import com.xworkz.InheritanceDataType.Harshitha;
import com.xworkz.InheritanceDataType.Omkar;
import com.xworkz.InheritanceDataType.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		
		Divya divya=new Divya();
		divya.wear();
		System.out.println("---------------");
		
		Shoe shoe=new Shoe();
		
		Omkar omkar=new Omkar();
		omkar.wash(shoe);
		System.out.println("---------------");
		
		Harshitha harshitha =new Harshitha();
		harshitha.shoe=new Shoe();
		harshitha.dry();
				
	}

}
