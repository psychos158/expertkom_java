package lekce5;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vytvoøení nového "Example" s názvem "demonstration"
				Example demonstration = new Example(); 
				// Na pøíkladu s názvem "demonstration" volám metodu uvnitø tøídy example, která se jemnu demonstrateObjectReference();
				demonstration.demonstrateObjectReference();
				
				// Vytvoøení nového ArrayList s názvem "pets" a pøidání domácích mazlíèkù do listu.
				List<String> pets = new ArrayList<>();
					pets.add("Pes");
					pets.add("Koèka");
					pets.add("Opièka");
					pets.add("Op");
					pets.add("Žako");
					pets.add("Medvídek mýval");
				ZooList petsZoolist = new ZooList(pets);	
				List<String> petsShorterThanFive = petsZoolist.getWordShorterThanFive();
				petsZoolist.printList(petsShorterThanFive);				
				
				// Vytvoøení nového ArrayList s názvem "beasts" a pøidání nestvùr do listu.	
				List<String> beasts = new ArrayList<>();
					beasts.add("Míša Stavrev");
					beasts.add("Ondra Hájkù");
					beasts.add("Ondra Hálkù a.k.a Benešù");
					beasts.add("MST");
					beasts.add("OHA");
					beasts.add("OHL");
					
				ZooList beastsZoolist = new ZooList(beasts);	
				List<String> beastsShorterThanFive = beastsZoolist.getWordShorterThanFive();
				beastsZoolist.printList(beastsShorterThanFive); 
		
	}

}
