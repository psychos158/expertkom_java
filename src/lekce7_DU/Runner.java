package lekce7_DU;

import java.util.ArrayList;

import lekce6.MinimumFinder;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listOfInteger1 = new ArrayList<>();
		listOfInteger1.add(1);
		listOfInteger1.add(-50);
		listOfInteger1.add(13);
		listOfInteger1.add(4);
		listOfInteger1.add(10);
		listOfInteger1.add(3);
		String ascDesc = "asc";
		
		ListOrganizer unSortedIntegers = new ListOrganizer();
		ArrayList<Integer> listOfInteger2 = unSortedIntegers.getSortedIntegers(listOfInteger1, ascDesc);
		System.out.print(listOfInteger2);
	}

}
