package com.ch17.runner;

import com.ch17.task.SandalStore;
import com.ch17.task.data.Sandal;

public class SandalStoreRunner {

	public static void main(String[] args) {
		
		SandalStore datas=new SandalStore();
		datas.display();
		Sandal data=new Sandal("Wood Land", '9', 1500, "grey");
		data.show();
		Sandal data2=new Sandal("Nike", '8', 2500, "white");
		data2.show();
		Sandal data3=new Sandal("Adidas", '8', 2500, "Sandal");
		data3.show();
		Sandal data4=new Sandal("Skechers", '7', 3500, "Black");
		data4.show();
		Sandal data5=new Sandal("Crocs", '6', 1500, "Blue");
		data5.show();
		
	}

}
