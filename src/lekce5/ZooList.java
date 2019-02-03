package lekce5;

import java.util.ArrayList;
import java.util.List;

public class ZooList {
	
	private List<String> animals;
	
	public ZooList(List <String> animals) {
		super();
		this.animals = animals;
	}
	
	public List<String> getWordShorterThanFive(){
		List<String> shorterPets = new ArrayList<String>();
		for (String s : this.animals) {
			if (s.length() < 5) {
				shorterPets.add(s);
			}
		}
		return 	shorterPets;
	}
	
	public void printList(List<String> shorterPets) {
		for (String listElement : shorterPets) {
			System.out.print(listElement);
			System.out.print("\n");
		}
	}
}
