package com.xworkz.procedure.internal;

public class KSRBangaloreRailwayStation implements RailwayStationRule {
	
	@Override
	public boolean platformTicket() {
		System.out.println("Execute a platform ticket in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean trainTicket() {
		System.out.println("Execute a train ticket in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean stationMaster() {
		System.out.println("Execute a station master in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean policeStation() {
		System.out.println("Execute a police station in KSR Bangalore ");
		return true;
	}  
	
	@Override
	public boolean chainSnatcher() {
		System.out.println("Execute a change snatcher in KSR Bangalore ");
		return false;
	}
	
	@Override
	public boolean signals() {
		System.out.println("Execute a signals in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean ticketCounter() {
		System.out.println("Execute a ticket counter in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean toilet() {
		System.out.println("Execute a toilet in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean drinkingWater() {
		System.out.println("Execute a drinking water in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean foodStall() {
		System.out.println("Execute a footstall in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean announcementBoard() {
		System.out.println("Execute a announcement board in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean noSmoking() {
		System.out.println("Execute a no smoking in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean keepSilence() {
		System.out.println("Execute a keep silence in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean trainSchedule() {
		System.out.println("Execute train schedule in KSR Bangalore ");
		return true;
	}
	
	@Override
	public boolean parkingFacility() {
		System.out.println("Execute a parking facility in KSR Bangalore");
		return true;
	}

}
