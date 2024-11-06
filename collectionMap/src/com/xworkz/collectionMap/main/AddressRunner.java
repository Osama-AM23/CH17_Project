package com.xworkz.collectionMap.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.collectionMap.dto.AddressDTO;

public class AddressRunner {

	public static void main(String[] args) {
		
		AddressDTO address1= new AddressDTO(2, "MGR Nagar", "TN");
		AddressDTO address2= new AddressDTO(5, "Bysham Nagar", "KA");
		AddressDTO address3= new AddressDTO(1, "KR Street", "KA");
		AddressDTO address4= new AddressDTO(24, "Down Rd", "TN");
		AddressDTO address5= new AddressDTO(15, "MG Rd", "KA");
		
		// Name, AddressDTO
		Map<String, AddressDTO> map=new HashMap<String, AddressDTO>();
		
		map.put("Osama",address1);
		map.put("Ajay", address2);
		map.put("Arun", address3);
		map.put("Aswin", address4);
		map.put("Chethan",address5);
		
		Set<String> keys=map.keySet();
		keys.forEach(key->System.out.println(key));
		System.out.println("----------");
		
		Collection<AddressDTO> val=map.values();
		val.forEach(value->System.out.println(value));
		System.out.println("----------");
		
		Set<Map.Entry<String, AddressDTO>> entries=map.entrySet();
		entries.forEach(entry->System.out.println(entry));
	}

}
