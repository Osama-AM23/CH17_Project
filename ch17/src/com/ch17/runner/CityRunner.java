package com.ch17.runner;

import com.ch17.task.City;

public class CityRunner {

	public static void main(String[] args) {
		 
		City city1= new City();
		city1.store("Chennai");
		city1.store("Bangalore");
		city1.store("Coimbatore");
		city1.store("Wayanadu");
		city1.store("Mumbai");
		city1.store("Delhi");
		city1.store("Salem");
		city1.show();
		
	}

}
