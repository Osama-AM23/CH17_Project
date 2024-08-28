package com.xworkz.InheritanceDataType.Runner;

import com.xworkz.InheritanceDataType.Haji;
import com.xworkz.InheritanceDataType.Osama;
import com.xworkz.InheritanceDataType.Salim;
import com.xworkz.InheritanceDataType.Towel;

public class TowelRunner {

	public static void main(String[] args) {

		Osama osama = new Osama();
		osama.buy();
		System.out.println("---------------");
		Towel towel = new Towel();

		Haji haji = new Haji();
		haji.using(towel);
		System.out.println("---------------");

		Salim salim = new Salim();
		salim.towel = new Towel();
		salim.fold();

	}

}
