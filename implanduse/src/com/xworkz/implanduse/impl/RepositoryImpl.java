package com.xworkz.implanduse.impl;

import com.xworkz.implanduse.interfaces.Repository;

public class RepositoryImpl implements Repository {

	@Override
	public boolean save() {
		System.out.println("Execute a save in RepositoryImpl");
		return true;
	}

}
