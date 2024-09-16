package com.xworkz.procedure.internal;

public class BangloreTrafficRules implements TrafficRule {

	@Override
	public boolean licence() {
		System.out.println("Execute a Licence in BangloreTrafficRules");
		return true;
	}

	@Override
	public boolean helmet() {
		System.out.println("Execute a Helmet in BangloreTrafficRules");
		return true;
	}

	@Override
	public boolean numberPlate() {
		System.out.println("Execute a numberPlate in BangloreTrafficRules");
		return true;
	}

	@Override
	public double speedLimit() {
		System.out.println("Execute a SpeedLimit in BangloreTrafficRules");
		return 50;
	}

	@Override
	public int noOfPerson() {
		System.out.println("Execute a noOfPerson in BangloreTrafficRules");
		return 2;
	}

	@Override
	public boolean directionIndicator() {
		System.out.println("Execute a direction Indicator in BangloreTrafficRules");
		return false;
	}

	@Override
	public boolean insurance() {
		System.out.println("Execute a Insurance in BangloreTrafficRules");
		return true;
	}

	@Override
	public boolean rcBook() {
		System.out.println("Execute a rcBook in BangloreTrafficRules");
		return false;
	}

	@Override
	public boolean seatBelt() {
		System.out.println("Execute a seat Belt in BangloreTrafficRules");
		return false;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("Execute a no Smoking in BangloreTrafficRules");
		return true;
	}

	@Override
	public boolean noDrink() {
		System.out.println("Execute a no Drink in BangloreTrafficRules");
		return false;
	}

	@Override
	public boolean noParkToPublicPlace() {
		System.out.println("Execute a noParkToPublicPlace in BangloreTrafficRules");
		return false;
	}

	@Override
	public boolean noModification() {
		System.out.println("Execute a noModification in BangloreTrafficRules");
		return true;
	}

	@Override
	public boolean ambulanceFreePassage() {
		System.out.println("Execute a ambulanceFreePassage in BangloreTrafficRules");
		return true;
	}

	@Override
	public boolean useHornInSilentZone() {
		System.out.println("Execute a useHornInSilentZone");
		return false;
	}

}
