package lekce7_DU;

import java.util.ArrayList;
import java.util.Collections;

public class ListOrganizer {
	/* 
	 * Lekce 5 - slide 35, úkol è. 4:
	 * Pre opakovanie príklad na array: 
	 * napíšte funkciu, ktorá jako argument dostane array integerov a vráti array,
	 * ktorý obsahuje tieto integere zoradené od najveèšieho po najmenší / od najmenšieho po najveèší. (na gitHube)
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
