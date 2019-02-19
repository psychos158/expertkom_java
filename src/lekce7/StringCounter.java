package lekce7;

import java.util.HashMap;
import java.util.List;

public class StringCounter {
	
	public HashMap <String, Integer> countStringList(List<String> Data){
		HashMap <String, Integer> firstHashMapResults = new HashMap <String, Integer>();
		
		Integer i = 1;
		
		for (String s : Data) {
			
			if(firstHashMapResults.containsKey(s)) {
				firstHashMapResults.put(s, firstHashMapResults.get(s) + 1);
		
			}
			else {
				firstHashMapResults.put(s, i);
			}
					
		}
		return firstHashMapResults;
	}

}
