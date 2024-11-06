package com.xworkz.collectionMap.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xworkz.collectionMap.dto.ContinentDTO;
import com.xworkz.collectionMap.dto.CountryDTO;

public class ContinentRunner {

	public static void main(String[] args) {

		CountryDTO country1 = new CountryDTO("India", "IND");
		CountryDTO country2 = new CountryDTO("America", "USA");
		CountryDTO country3 = new CountryDTO("Saudi Arabia", "SAU");
		CountryDTO country4 = new CountryDTO("Korea", "KR");
		CountryDTO country5 = new CountryDTO("China", "CN");

		List<CountryDTO> list = new LinkedList<CountryDTO>();
		list.add(country1);
		list.add(country2);
		list.add(country3);
		list.add(country4);
		list.add(country5);

		ContinentDTO continent1 = new ContinentDTO("Asia", "AS");
		ContinentDTO continent2 = new ContinentDTO("North America", "NA");
		ContinentDTO continent3 = new ContinentDTO("Middle East", "ME"); // Use distinct names
		ContinentDTO continent4 = new ContinentDTO("East Asia", "EA");
		ContinentDTO continent5 = new ContinentDTO("Southeast Asia", "SEA");

		Map<ContinentDTO, List> map = new HashMap<>();
		map.put(continent1, list);
		map.put(continent2, list);
		map.put(continent3, list);
		map.put(continent4, list);
		map.put(continent5, list);

		Set<ContinentDTO> keys = map.keySet();
		keys.forEach(key -> System.out.println(key));
		System.out.println("---------------");

		Collection<List> value = map.values();

		System.out.println(value + "=============");

		System.out.println("=================================================");
		Set<Map.Entry<ContinentDTO, List>> entries = map.entrySet();
		entries.forEach(entry -> System.out.println(entry.getKey() + " , " + entry.getValue()));

	}

}
