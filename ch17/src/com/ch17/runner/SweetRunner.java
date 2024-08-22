package com.ch17.runner;

import com.ch17.task.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		
		Sweet sweet1=new Sweet();
		sweet1.store("Gulab Jammun");
		sweet1.store("Laddo");
		sweet1.store("Rassa Malai");
		sweet1.store("Chandrakala");
		sweet1.store("Jelabeei");
		sweet1.store("Mysore pak");
		sweet1.store("Pal Kovha");
		sweet1.display();
	}

}
