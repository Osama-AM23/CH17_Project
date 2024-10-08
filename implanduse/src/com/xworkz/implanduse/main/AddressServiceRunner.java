package com.xworkz.implanduse.main;

import com.xworkz.implanduse.impl.AddressRepositoryImpl;
import com.xworkz.implanduse.impl.AddressServiceImpl;
import com.xworkz.implanduse.interfaces.AddressRepository;
import com.xworkz.implanduse.interfaces.AddressService;

public class AddressServiceRunner {

	public static void main(String[] args) {

		AddressRepository repository = new AddressRepositoryImpl();

		AddressService service = new AddressServiceImpl(repository);
		boolean check = service.push();
		System.out.println(check);
		System.out.println("----------");
		int no = service.refresh();
		System.out.println(no);
		System.out.println("----------");

		service.remove();
		System.out.println("----------");

		String msg = service.load();
		System.out.println(msg);
	}

}
