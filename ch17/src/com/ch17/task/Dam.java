package com.ch17.task;

public class Dam {
	
	private String[] dames=new String[7];
	private int print=0;
	
	public void store(String damName)
	{
		dames[print]=damName;
		print++;
	}
	
	public void display()
	{
		for(String var: dames)
		{
			System.out.println("Dam Name:"+var);
		}
		
	}
}
