package com.harinder.java.learning;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("Harinder", 1000);
		map.put("Manav", 200);
		map.put("Amit", 333);
		map.put("Vipin", 456);
		System.out.println(map); // prints in {} because of map
		
		Set entrySet = map.entrySet();
		System.out.println(entrySet); // prints in [] as in collections
		
		Set keySet = map.keySet();
		System.out.println(keySet);
		
		Collection values = map.values();
		System.out.println(values);
		
		Iterator itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Map.Entry obj = (Map.Entry) itr.next();
			if(obj.getKey().equals("Harinder"))
			{
				obj.setValue(2000);
			}
		}
		System.out.println(map);
	}

}
