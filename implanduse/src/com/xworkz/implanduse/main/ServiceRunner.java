package com.xworkz.implanduse.main;

import com.xworkz.implanduse.impl.RepositoryImpl;
import com.xworkz.implanduse.impl.ServiceImpl;
import com.xworkz.implanduse.interfaces.Repository;
import com.xworkz.implanduse.interfaces.Serivce;

public class ServiceRunner {

	public static void main(String[] args) {

		Repository repo = new RepositoryImpl();

		Serivce ser = new ServiceImpl(repo);
		String ref = ser.push();
		System.out.println("Push :" + ref);
	}

}
