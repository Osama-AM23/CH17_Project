package com.xworkz.implanduse.main;

import com.xworkz.implanduse.impl.MachineRepositoryImpl;
import com.xworkz.implanduse.impl.MachineServiceImpl;
import com.xworkz.implanduse.interfaces.MachineRepository;
import com.xworkz.implanduse.interfaces.MachineService;

public class MachineServiceRunner {

	public static void main(String[] args) {
		
		MachineRepository repository= new MachineRepositoryImpl();
		
		MachineService service= new MachineServiceImpl(repository);
		service.save();
		System.out.println("----------");
		int num=service.update();
		System.out.println("Updated :"+num);
		System.out.println("----------");
		int i=service.delete();
		System.out.println("Deleted:"+i);
		System.out.println("----------");
		int read=service.read();
		System.out.println("Readed:"+read);
	}

}
