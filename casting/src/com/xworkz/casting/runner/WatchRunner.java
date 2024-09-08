package com.xworkz.casting.runner;

import com.xworkz.casting.internal.SmartWatch;
import com.xworkz.casting.internal.Student;
import com.xworkz.casting.internal.Watch;

public class WatchRunner {

	public static void main(String[] args) {
		
		Student student= new Student();
		Watch watch=new Watch();
		SmartWatch smartwatch= new SmartWatch();
		
		student.use(watch);
		System.out.println("---------------");
		student.use(smartwatch);
		
	}

}
