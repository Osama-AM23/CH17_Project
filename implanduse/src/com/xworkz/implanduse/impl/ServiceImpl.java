package com.xworkz.implanduse.impl;

import com.xworkz.implanduse.interfaces.Repository;
import com.xworkz.implanduse.interfaces.Serivce;

public class ServiceImpl implements Serivce {
	
	private Repository repository;
	
	public ServiceImpl(Repository repository) {
		this.repository= repository;
		System.out.println("repository parameter in ServiceImpl Constructor");
	}
	

	@Override
	public String push() {
		System.out.println("Execute a push in Service Impl");
		if(repository != null) {
			boolean saved=repository.save();
			if(saved) {
				System.out.println("Saved in Repository");
				return "Success";
			}
		}else {
			System.out.println("Not Saved");
			return "Failed";
		}
		
		return "Some Issues";
	}

}
