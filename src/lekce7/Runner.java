package lekce7;

import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Auto");
		list1.add("Auto");	
		list1.add("Auto");
		list1.add("Koèka");
		list1.add("Koèka");
		list1.add("Koèka");
		list1.add("Ondra");
		list1.add("Michal");
		list1.add("Auto");
		list1.add("Auto");
	 
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Ondra");
		list2.add("Ondra");
		list2.add("Ondra");
		list2.add("Ondra");
		list2.add("Ondra");
		list2.add("Ondra");
	
	StringCounter counterOfAnimals = new StringCounter();
	HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
	hashmap = counterOfAnimals.countStringList(list1);
	System.out.print(hashmap);
	System.out.println("");
	
	StringCounter counterOfOndra = new StringCounter();
	HashMap<String, Integer> hashmap2 = new HashMap<String, Integer>();
	hashmap2 = counterOfOndra.countStringList(list2);
	System.out.print(hashmap2);
	
	
	}

}
