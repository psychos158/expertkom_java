package lekce7_DU;

import java.util.ArrayList;
import java.util.Collections;

public class ListOrganizer {
	/* 
	 * Lekce 5 - slide 35, �kol �. 4:
	 * Pre opakovanie pr�klad na array: 
	 * nap�te funkciu, ktor� jako argument dostane array integerov a vr�ti array,
	 * ktor� obsahuje tieto integere zoraden� od najve�ieho po najmen�� / od najmen�ieho po najve��. (na gitHube)
	 */
	
	public ArrayList<Integer> getSortedIntegers(ArrayList<Integer>ListOfIntegers, String ascDesc){
		if (ascDesc == "asc") {
			Collections.sort(ListOfIntegers);
		}	
		else  {
			Collections.sort(ListOfIntegers, Collections.reverseOrder());
		}
		return ListOfIntegers;
		
		
	}
}
