package com.xworkz.implanduse.interfaces;

public interface AddressRepository {
	
	boolean save();
	
	int update();
	
	void delete();
	
	String read();

}
