package com.evaluate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {/*

		List<String> strings = new ArrayList<String>();
		String[] arrstr= {"stack", "overflow", "stack", "yahoo", "google", "msn", "MSN", "stack", "overflow", "user"};
		
		for(int i=0;i<arrstr.length;i++){
			strings.add(arrstr[i]);
		}

		Map<String, Integer> counts = new HashMap<String, Integer>();

		for (String str : strings) {
			System.out.println("counts.containsKey(str)"+counts.containsKey(str));
		    if (counts.containsKey(str)) {
		    	System.out.println("counts.get(str) + 1"+counts.get(str) + 1);
		        counts.put(str, counts.get(str) + 1);
		    } else {
		        counts.put(str, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	*/
		
		List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println("List::"+l.toString());  
        
        Set<String> s=new HashSet<String>(l);
        
        System.out.println("Set::"+s);
	
       /* List<String> l1 = new ArrayList<String>(s);  
	
        System.out.println("List::"+l1);*/

	
	
	}

}
