package lekce5;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vytvo�en� nov�ho "Example" s n�zvem "demonstration"
				Example demonstration = new Example(); 
				// Na p��kladu s n�zvem "demonstration" vol�m metodu uvnit� t��dy example, kter� se jemnu demonstrateObjectReference();
				demonstration.demonstrateObjectReference();
				
				// Vytvo�en� nov�ho ArrayList s n�zvem "pets" a p�id�n� dom�c�ch mazl��k� do listu.
				List<String> pets = new ArrayList<>();
					pets.add("Pes");
					pets.add("Ko�ka");
					pets.add("Opi�ka");
					pets.add("Op");
					pets.add("�ako");
					pets.add("Medv�dek m�val");
				ZooList petsZoolist = new ZooList(pets);	
				List<String> petsShorterThanFive = petsZoolist.getWordShorterThanFive();
				petsZoolist.printList(petsShorterThanFive);				
				
				// Vytvo�en� nov�ho ArrayList s n�zvem "beasts" a p�id�n� nestv�r do listu.	
				List<String> beasts = new ArrayList<>();
					beasts.add("M�a Stavrev");
					beasts.add("Ondra H�jk�");
					beasts.add("Ondra H�lk� a.k.a Bene��");
					beasts.add("MST");
					beasts.add("OHA");
					beasts.add("OHL");
					
				ZooList beastsZoolist = new ZooList(beasts);	
				List<String> beastsShorterThanFive = beastsZoolist.getWordShorterThanFive();
				beastsZoolist.printList(beastsShorterThanFive); 
		
	}

}
