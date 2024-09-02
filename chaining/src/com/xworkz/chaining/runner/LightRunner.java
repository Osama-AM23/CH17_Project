package com.xworkz.chaining.runner;

import com.xworkz.chaining.Led;

public class LightRunner {

	public static void main(String[] args) {
		
		Led led= new Led();
		led.broke();
		led.on();
	}

}
