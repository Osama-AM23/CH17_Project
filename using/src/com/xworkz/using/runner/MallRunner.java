package com.xworkz.using.runner;

import com.xworkz.using.imp.LuluMallRule;
import com.xworkz.using.imp.MallManagement;
import com.xworkz.using.imp.MallRule;

public class MallRunner {

	public static void main(String[] args) {
		
		MallRule mallRule=new LuluMallRule();
		
		MallManagement management= new MallManagement(mallRule);
		management.check();

	}

}
