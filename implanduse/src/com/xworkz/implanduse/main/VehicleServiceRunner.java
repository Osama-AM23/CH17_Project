package com.xworkz.implanduse.main;

import com.xworkz.implanduse.impl.VehicleRepositoryImpl;
import com.xworkz.implanduse.impl.VehicleServiceImpl;
import com.xworkz.implanduse.interfaces.VehicleRepository;
import com.xworkz.implanduse.interfaces.VehicleService;

public class VehicleServiceRunner {

	public static void main(String[] args) {
		
		
		VehicleRepository repository= new VehicleRepositoryImpl();
		
		VehicleService service= new VehicleServiceImpl(repository);
		service.persist();
		System.out.println("----------");
		service.merge();
		System.out.println("----------");
		boolean ref=service.clear();
		System.out.println("Clear :"+ref);
		System.out.println("----------");
		String search=service.search();
		System.out.println("Search :"+search);

	}

}
