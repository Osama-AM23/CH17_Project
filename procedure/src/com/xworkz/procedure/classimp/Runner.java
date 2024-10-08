package com.xworkz.procedure.classimp;

import com.xworkz.procedure.internal.BangloreTrafficRules;
import com.xworkz.procedure.internal.BankRule;
import com.xworkz.procedure.internal.CollegeRule;
import com.xworkz.procedure.internal.DBCRules;
import com.xworkz.procedure.internal.HospitalRule;
import com.xworkz.procedure.internal.IskconTemple;
import com.xworkz.procedure.internal.KSRBangaloreRailwayStation;
import com.xworkz.procedure.internal.NimansHospital;
import com.xworkz.procedure.internal.RailwayStationRule;
import com.xworkz.procedure.internal.SBIBankRule;
import com.xworkz.procedure.internal.TempleRule;
import com.xworkz.procedure.internal.TrafficRule;

public class Runner {

	public static void main(String[] args) {

		HospitalRule hospital = new NimansHospital();
		System.out.println("Visiting Person:" + hospital.noOfVisiters());
		System.out.println("Admission:" + hospital.getAdmissionPolicy());
		System.out.println("Silent:" + hospital.beSilent());

		System.out.println("+++++++++++++++++++++++++");

		TrafficRule traffic = new BangloreTrafficRules();
		System.out.println(traffic.licence());
		System.out.println(traffic.helmet());
		System.out.println(traffic.numberPlate());
		System.out.println(traffic.speedLimit());
		System.out.println(traffic.noOfPerson());
		System.out.println(traffic.directionIndicator());
		System.out.println(traffic.licence());
		System.out.println(traffic.rcBook());
		System.out.println(traffic.seatBelt());
		System.out.println(traffic.noSmoking());
		System.out.println(traffic.noDrink());
		System.out.println(traffic.noParkToPublicPlace());
		System.out.println(traffic.noModification());
		System.out.println(traffic.ambulanceFreePassage());
		System.out.println(traffic.useHornInSilentZone());
		System.out.println("+++++++++++++++++++++++++");

		CollegeRule college= new DBCRules();
		System.out.println(college.idCard());
		System.out.println(college.inShirt());
		System.out.println(college.shoes());
		System.out.println(college.setClgTiming());
		System.out.println(college.time());
		System.out.println(college.antiRagging());
		System.out.println(college.smoking());
		System.out.println(college.setDressCode());
		System.out.println(college.books());
		System.out.println(college.setLibHours());
		System.out.println("+++++++++++++++++++++++++");
		
		TempleRule temple= new IskconTemple();
		System.out.println(temple.openingTime());
		System.out.println(temple.closingTime());
		System.out.println(temple.KeepSilence());
		System.out.println(temple.prayerTime());
		System.out.println(temple.donationPolicy());
		System.out.println(temple.dressCode());
		System.out.println(temple.visitorRule());
		System.out.println(temple.noPhones());
		System.out.println(temple.noCamera());
		System.out.println(temple.guide());
		System.out.println("+++++++++++++++++++++++++");
		
		RailwayStationRule railway= new KSRBangaloreRailwayStation();
		System.out.println(railway.platformTicket());
		System.out.println(railway.trainTicket());
		System.out.println(railway.stationMaster());
		System.out.println(railway.policeStation());
		System.out.println(railway.chainSnatcher());
		System.out.println(railway.signals());
		System.out.println(railway.ticketCounter());
		System.out.println(railway.toilet());
		System.out.println(railway.drinkingWater());
		System.out.println(railway.foodStall());
		System.out.println(railway.foodStall());
		System.out.println(railway.announcementBoard());
		System.out.println(railway.noSmoking());
		System.out.println(railway.keepSilence());
		System.out.println(railway.trainSchedule());
		System.out.println(railway.parkingFacility());
		System.out.println("+++++++++++++++++++++++++");
		
		BankRule bank= new SBIBankRule();
		System.out.println(bank.manager());
		System.out.println(bank.amount());
		System.out.println(bank.account());
		System.out.println(bank.keepSilent());
		System.out.println(bank.locker());
		System.out.println(bank.minBalance());
		System.out.println(bank.transactionFee());
		System.out.println(bank.withdrawl());
		System.out.println(bank.deposit());
		System.out.println(bank.keepClean());
		System.out.println(bank.longTermLoan());
		System.out.println(bank.getDebitCard());
		System.out.println(bank.getCreditCard());
		System.out.println(bank.onlineBanking());

	}

}
