package lekce_1;

import java.util.Scanner;

public class notNullNumbers {
	public static void main(String[] args) {
		
		double delenec, delitel, vysledek;
		Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte nenulového dělence:");
        delenec = sc.nextDouble();
	    System.out.println("Zadejte nenulového dělitele:");
	    delitel = sc.nextDouble();
	    	if(delenec != 0 && delitel !=0) {
	    		vysledek = delenec / delitel;
	    		System.out.println("Výsledek je: " + vysledek);
	    			}
	    	else { 
	    		System.out.println("Zadejte nenulové hodnoty na vstupu!");
	        }
	}
}
