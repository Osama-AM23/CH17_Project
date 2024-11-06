package com.xworkz.collectionMap.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		// mobileNo, Email
		Map<Long, String> map= new HashMap<>();
		
		map.put(9952644296L, "osama@gmail.com");
		map.put(8072235711L, "farhan@gmail.com");
		map.put(9655997234L, "akhib@gmail.com");
		map.put(9842666881L, "azees@gmail.com");
		map.put(9986667354L, "omkar@gmail.com");
		map.put(6005370241L, "saqib@gmail.com");
		map.put(8548866698L, "chethan@gmail.com");
		
		Set<Long> key=map.keySet();
		key.forEach(keys->System.out.println(keys));
		System.out.println("----------------");
		
		Collection<String> val=map.values();
		val.forEach(value->System.out.println(value));
		System.out.println("----------------");
		
		Set<Map.Entry<Long, String>> entry=map.entrySet();
		entry.forEach(entries->System.out.println(entries));
		
	}

}
