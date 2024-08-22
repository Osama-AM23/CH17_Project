package com.ch17.task;

public class River {
	private String[] rivers=new String[7];
	private int index=0;
	
	public void store(String riverName)
	{
		rivers[index]=riverName;
		index++;
	}
	public void display()
	{
		for(String val: rivers)
		{
			System.out.println("River Name :"+val);
			
		}
	}
}
