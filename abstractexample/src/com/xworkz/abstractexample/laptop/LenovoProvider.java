package com.xworkz.abstractexample.laptop;

import com.xworkz.abstractexample.internetprovider.Provider;

public class LenovoProvider extends Provider {

	public LenovoProvider(String name, String ceo) {
		super(name, ceo);
		System.out.println("Constructor of Lenovo Provider with Name and ceo");
	}
	
	@Override
	public void service() {
		System.out.println("Running Service in Lenovo Provider");
	}

}
