package com.ch17.runner;

import com.ch17.task.MarketStore;
import com.ch17.task.data.MarketData;

public class MarketStoreRunner {

	public static void main(String[] args) {
		
		MarketStore datas=new MarketStore();
		datas.display();
		MarketData data=new MarketData("KR Market", "Chickpet");
		data.show();
		MarketData data2=new MarketData("Malleswaram Market", "Malleswaram");
		data2.show();
		MarketData data3=new MarketData("Commercial Street", "Shivaji Nagar");
		data3.show();
		MarketData data4=new MarketData("MG Road", "Shanthala Nagar");
		data4.show();
		MarketData data5=new MarketData("Residency Road", "Ashok nagar");
		data5.show();
		
	}

}
