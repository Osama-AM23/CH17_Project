package com.xworkz.casting.internal;

public class Student {
	
	public void use(Watch watch)
	{
		System.out.println("Running a use in Student");
		watch.wear();
		
		if(watch instanceof SmartWatch)
		{
			System.out.println("Instance of Smart Watch");
			SmartWatch smartwatch= (SmartWatch) watch;
			smartwatch.time();
		}
	}

}
