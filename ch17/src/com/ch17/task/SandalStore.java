package com.ch17.task;

import com.ch17.task.data.Sandal;

public class SandalStore {
  private Sandal[] sandal=new Sandal[5];
  private int index=0;
  
  public void store(Sandal name)
  {
	  sandal[index]=name;
	  index++;
  }
  
  public void display()
  {
	  for(Sandal ref: sandal)
	  {
		 if(ref !=null) {
			 ref.show();
		 }else {
			 System.out.println("No Data");
		 }
	  }
  }
}
