package lekce6;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class DuplicitySelector {
	
	public List<String> getDuplicityStrings(List<String>ListData){
		
		ArrayList<String> ListOfDuplicities = new ArrayList<>();
		HashSet<String> hash = new HashSet<String>();
		HashSet<String> duplicitiesHash = new HashSet<String>();
		
		for (String s : ListData) {
			if(hash.add(s)) {
			}
						
			else if (duplicitiesHash.add(s)){
				
				ListOfDuplicities.add(s);	
			}
			else {
				
			}
	}
		return ListOfDuplicities;	
	}
}

