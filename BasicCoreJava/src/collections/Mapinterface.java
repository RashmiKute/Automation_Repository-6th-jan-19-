package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Mapinterface {

	public static void main(String[] args)
	{
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		map.put("Rashmi", 11491);
		map.put("Vishal", 40757);
		map.put("Pratik", 23456);
		map.put(null, 4236);
		map.put("Rashmi", 1491);   // when same key is used twice it takes the latest value
		
		Set<String> set=map.keySet();
		for(String key:set){
			System.out.println(map.get(key));   //fetching all the values all together
		}
		
//		System.out.println(map.get("Rashmi"));
//		System.out.println(map.get(null));
//		
//		
		
//		Hashtable<String, String> map2= new Hashtable<String, String>();
//		map2.put("Username","Kute123");
//		map2.put("password", "12234");
//		map2.put(null, "dhhd455");
//		
//		System.out.println(map2.get("Username"));
//	
		}	
}