package lekce6;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Minimum finder starts
		ArrayList<Integer> list1 = new ArrayList<>();
			list1.add(1);
			list1.add(50);
			list1.add(13);
			list1.add(4);
			list1.add(10);
			list1.add(3);
		 
		
		MinimumFinder minimum1 = new MinimumFinder(list1);
		int min = minimum1.getMinimumNumber();
		System.out.print(min);
		//Minimum finder ends
		
		//Duplicity Selector starts
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("duplicita1");
		list2.add("duplicita1");
		list2.add("duplicita1");
		list2.add("duplicita2");
		list2.add("duplicita2");
		list2.add("duplicita2");
		list2.add("duplicita2");
		list2.add("neduplicita1");
		list2.add("neduplicita2");
		DuplicitySelector duplicity = new DuplicitySelector();
		duplicity.getDuplicityStrings(list2);
		
		
		//Duplicity Selector ends

		
	}

}
