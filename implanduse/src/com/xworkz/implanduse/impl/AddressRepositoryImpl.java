package com.xworkz.implanduse.impl;

import com.xworkz.implanduse.interfaces.AddressRepository;

public class AddressRepositoryImpl implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("Save in AddressRepositoryImpl");
		return true;
	}

	@Override
	public int update() {
		System.out.println("Update in AddressRepositoryImpl");
		return 3;
	}

	@Override
	public void delete() {
		System.out.println("delete in AddressRepositoryImpl");

	}

	@Override
	public String read() {
		System.out.println("read in AddressRepositoryImpl");
		return "Readed";
	}

}
