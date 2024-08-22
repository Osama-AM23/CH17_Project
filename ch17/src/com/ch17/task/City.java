package com.ch17.task;

public class City {
	 private String[] cities=new String[7];
	 private int position=0;
	 
	 public void store(String cityName)
	 {
		 cities[position]=cityName;
		 position++;
		 
	 }
	 
	 public void show()
	 {
		 for(String reference: cities)
		 {
			 System.out.println("City Name :"+reference);
		 }
	 }
}
