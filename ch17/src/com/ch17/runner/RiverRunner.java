package com.ch17.runner;

import com.ch17.task.River;

public class RiverRunner {

	public static void main(String[] args) {
		
		River river=new River();
		river.store("Ganga");
		river.store("Yamuna");
		river.store("Narmada");
		river.store("Krishna");
		river.store("Mahanadi");
		river.store("Indus");
		river.store("Godvari");
		river.display();
		
		
	}

}
