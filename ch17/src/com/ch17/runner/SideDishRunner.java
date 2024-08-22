package com.ch17.runner;

import com.ch17.task.SideDishStore;

import com.ch17.task.data.SideDishData;

public class SideDishRunner {

	public static void main(String[] args) {
		
		SideDishStore store=new SideDishStore();
		store.display();
		SideDishData data=new SideDishData("Egg", 50, "Non-Veg");
		data.show();
		SideDishData data2=new SideDishData("Mutton", 250, "Non-Veg");
		data2.show();
		SideDishData data3=new SideDishData("Chicken", 150, "Non-Veg");
		data3.show();
		SideDishData data4=new SideDishData("Fish", 300, "Non-Veg");
		data4.show();
		SideDishData data5=new SideDishData("Prawn", 600, "Non-Veg");
		data5.show();
	}

}
