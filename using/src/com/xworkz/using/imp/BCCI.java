package com.xworkz.using.imp;

public class BCCI {
	
	private CricketRule cricketRule;
	
	public void setCricketRule(CricketRule cricketRule)
	{
		this.cricketRule=cricketRule;
	}
	
	public void check()
	{
		if(cricketRule != null)
		{
			System.out.println("Cricket rule is not Null");
			cricketRule.powerPlay();
		}
		else {
			System.out.println("cricketRule is Null");
		}
	}

}
