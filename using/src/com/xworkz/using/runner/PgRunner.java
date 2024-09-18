package com.xworkz.using.runner;

import com.xworkz.using.imp.GoldenVillaPG;
import com.xworkz.using.imp.PGRule;
import com.xworkz.using.imp.PgOwner;

public class PgRunner {

	public static void main(String[] args) {
		
		PGRule pgRule= new GoldenVillaPG();
		
		PgOwner owner= new PgOwner(pgRule);
		owner.check();
		
	}

}
