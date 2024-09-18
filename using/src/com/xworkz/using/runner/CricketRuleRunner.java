package com.xworkz.using.runner;

import com.xworkz.using.imp.BCCI;
import com.xworkz.using.imp.CricketRule;
import com.xworkz.using.imp.TNCricketRule;

public class CricketRuleRunner {

	public static void main(String[] args) {
		
		CricketRule cricketRule= new TNCricketRule();
		
		BCCI bcci = new BCCI();
		bcci.setCricketRule(cricketRule);
		bcci.check();
	}

}
