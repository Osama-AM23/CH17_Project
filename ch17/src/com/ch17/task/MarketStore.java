package com.ch17.task;

import com.ch17.task.data.MarketData;

public class MarketStore {
	
	private MarketData[] market=new MarketData[5];
	private int index=0;
	
	public void store(MarketData name)
	{
		market[index]=name;
		index++;
	}
	
	public void display()
	{
		for(MarketData ref: market)
		{
			if(ref !=null)
			{
				ref.show();
			}
			else {
				System.out.println("No Data");
			}
		}
	}
}
