package com.xworkz.collectionMap.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.collectionMap.dto.AddressDTO;
import com.xworkz.collectionMap.dto.CountryDTO;
import com.xworkz.collectionMap.dto.PresidentDTO;

public class CountryRunner {

	public static void main(String[] args) {

		PresidentDTO president1 = new PresidentDTO("Droupadi Murmu", "Teacher", 66);
		PresidentDTO president2 = new PresidentDTO("Joe Biden", "Advocate", 81);
		PresidentDTO president3 = new PresidentDTO("Mohammed bin Salman ", "Body man", 39);
		PresidentDTO president4 = new PresidentDTO("Yoon Suk Yeol", "Lawyer", 42);
		PresidentDTO president5 = new PresidentDTO("Xi Jinping", "Chemical Engineer", 71);

		CountryDTO country1 = new CountryDTO("India", "IND");
		CountryDTO country2 = new CountryDTO("America", "USA");
		CountryDTO country3 = new CountryDTO("Saudi Arabia", "SAU");
		CountryDTO country4 = new CountryDTO("Korea", "KR");
		CountryDTO country5 = new CountryDTO("China", "CN");

		Map<CountryDTO, PresidentDTO> map = new HashMap<CountryDTO, PresidentDTO>();

		map.put(country1, president1);
		map.put(country2, president2);
		map.put(country3, president3);
		map.put(country4, president4);
		map.put(country5, president5);

		Set<CountryDTO> set = map.keySet();
		set.forEach(sets -> System.out.println(sets));
		System.out.println("____________");

		Collection<PresidentDTO> val = map.values();
		val.forEach(value -> System.out.println(value));
		System.out.println("____________");
		Set<Map.Entry<CountryDTO, PresidentDTO>> entry = map.entrySet();
		entry.forEach(entries -> System.out.println(entries));

	}

}
