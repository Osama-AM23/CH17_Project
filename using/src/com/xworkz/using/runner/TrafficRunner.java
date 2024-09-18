package com.xworkz.using.runner;

import com.xworkz.using.imp.BangloreTrafficRule;
import com.xworkz.using.imp.RoadSafetyDepartment;
import com.xworkz.using.imp.TrafficRule;

public class TrafficRunner {

	public static void main(String[] args) {
		
		TrafficRule trafficRule= new BangloreTrafficRule();
		
		RoadSafetyDepartment roadSafety= new RoadSafetyDepartment(trafficRule);
		roadSafety.verify();
		
	}

}
