package lekce_1;

public class ReType {

	public static void main(String[] args) {
		int deset;
		int osm;
		int vysledekInt;
		float vysledekFloat;
		double vysledekDouble;
		
		deset = 10;
		osm = 8;
		
		vysledekInt = deset/osm;
		vysledekFloat = (float) deset/osm;
		vysledekDouble = (double) deset/osm; 
		System.out.println(vysledekInt);
		System.out.println(vysledekFloat);
		System.out.println(vysledekDouble);
	}

}
