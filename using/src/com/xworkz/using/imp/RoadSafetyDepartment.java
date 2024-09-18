package com.xworkz.using.imp;

public class RoadSafetyDepartment {

	private TrafficRule trafficRule;

	public RoadSafetyDepartment(TrafficRule trafficRule) {
		this.trafficRule = trafficRule;
	}

	public void verify() {
		System.out.println("Execute the Verify in Banglore Traffic Rule");
		if (trafficRule != null) {
			System.out.println("Traffic Rule is not Null");
			trafficRule.licenceNo();
		} else {
			System.out.println("Traffic Rule is Null");
		}
	}

}
