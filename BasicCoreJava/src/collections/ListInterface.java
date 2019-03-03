package collections;

import java.util.*;  //it is a predefined class of collection (* = arraylisy , linkedlist, Vector)



public class ListInterface {

	public static void main(String[] args) {
		
		//Array List

	/*	ArrayList<String> list = new ArrayList<>();
		list.add("Rashmi");
		list.add("Kute");
		list.add("Pune");
		
		for(String s:list){
			System.out.println(s);
		}
		}
		*/

//linked list
		
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Rashmi");
		list.add("Kute");
		list.add("Pune");
		
		for(String s:list){
			System.out.println(s);
		}
	
		
		//Vector
		
//		List<String> list = new Vector<>();
//		list.add("Rashmi");
//		list.add("Kute");
//		list.add("Pune");
//		
//		for(String s:list){
//			System.out.println(s);
//		}
	
}
}