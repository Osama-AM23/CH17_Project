package com.ch17.task;

import com.ch17.task.data.SideDishData;

public class SideDishStore {
	
	private SideDishData[] dish=new SideDishData[5];
	private int index=0;
	
	public void store(SideDishData name)
	{
		dish[index]=name;
		index++;
	}
	
	public void display()
	{
		for(SideDishData val: dish)
		{
			if(val !=null)
			{
				val.show();
			}
			else {
				System.out.println("No Data");
			}
		}
		
	}
	
}
