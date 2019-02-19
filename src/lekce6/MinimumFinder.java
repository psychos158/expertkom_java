package lekce6;
import java.util.ArrayList;
import java.util.List;

public class MinimumFinder {
		
	private List<Integer> number;
	
	public MinimumFinder(List<Integer> number) {
		super();
		this.number = number;
	}
	
	public int getMinimumNumber(){
		int minimumNumber = number.get(0);
		
		for (int i : number ) {
			
			if(minimumNumber > i) {
			minimumNumber = i;
		}
		
	}
		return minimumNumber;
	}


	
	

}
