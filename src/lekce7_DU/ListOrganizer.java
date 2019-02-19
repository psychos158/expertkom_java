package lekce7_DU;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOrganizer {
	/* 
	 * Lekce 5 - slide 35, �kol �. 4:
	 * Pre opakovanie pr�klad na array: 
	 * nap�te funkciu, ktor� jako argument dostane array integerov a vr�ti array,
	 * ktor� obsahuje tieto integere zoraden� od najve�ieho po najmen�� / od najmen�ieho po najve��. (na gitHube)
	 */
	
private ArrayList<Integer> ListOfIntegers;

public ListOrganizer(ArrayList<Integer> ListOfIntegers) {
	super();
	this.ListOfIntegers = ListOfIntegers;
}
	
	
	public ArrayList<Integer> getSortedIntegers(List<Integer>ListOfIntegers, String ascDesc){
		ArrayList<Integer> ascSortedListOfIntegers = new ArrayList<>();
		ArrayList<Integer> descSortedListOfIntegers = new ArrayList<>();
		ArrayList<Integer> emptyList = new ArrayList<>();
		
		
		if (ascDesc == "asc") {
			Collections.sort(ListOfIntegers);
				for (int i : ListOfIntegers) {
					ascSortedListOfIntegers.add(i);
				}
				return ascSortedListOfIntegers;
		}	
		else  {
			Collections.sort(ListOfIntegers, Collections.reverseOrder());
			for (int i : ListOfIntegers) {
				descSortedListOfIntegers.add(i);
			}
			return descSortedListOfIntegers;
		}
		
		
		
	}
}
