package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface2 {

	public static void main(String[] args) {
		
		HashSet<String> set= new HashSet<>();
		
		set.add("rashmi");
		set.add("kute");
		set.add("techbodhi");
	    set.add("pune");
	    set.add("rashmi");
	    
	    for(String a:set){
			System.out.println(a);
	}

//		Set<String> set= new TreeSet<>();
//		
//		set.add("rashmi");
//		set.add("kute");
//		set.add("techbodhi");
//	    set.add("pune");
//	    set.add("rashmi");
//	    
//	    for(String a:set){
//			System.out.println(a);
//    
//	    }
//	  
	}
}
	
