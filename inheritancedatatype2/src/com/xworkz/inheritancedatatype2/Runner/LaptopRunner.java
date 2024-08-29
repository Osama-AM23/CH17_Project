package com.xworkz.inheritancedatatype2.Runner;

import com.xworkz.inheritancedatatype2.Aswin;
import com.xworkz.inheritancedatatype2.Kalai;
import com.xworkz.inheritancedatatype2.Laptop;
import com.xworkz.inheritancedatatype2.Prem;
import com.xworkz.inheritancedatatype2.Sabrin;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Aswin aswin= new Aswin();
		aswin.use();
		System.out.println("_______________");
		
		Sabrin sabrin = new Sabrin();
		Laptop laptop=new Laptop("Lenovo", "Idea Pad", 53500);
		sabrin.off(laptop);
		System.out.println("_______________");

		Laptop laptop1=new Laptop("Lenovo", "Think Pad", 50999);
		Prem prem=new Prem(laptop1);
		prem.damage();
		System.out.println("_______________");

		
		Kalai kalai = new Kalai();
		kalai.repare();
		
	}

}
