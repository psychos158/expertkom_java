package lekce_1;

import java.util.Scanner;

public class notNullNumbers {
	public static void main(String[] args) {
		
		double delenec, delitel, vysledek;
		Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte nenulov�ho d�lence:");
        delenec = sc.nextDouble();
	    System.out.println("Zadejte nenulov�ho d�litele:");
	    delitel = sc.nextDouble();
	    	if(delenec != 0 && delitel !=0) {
	    		vysledek = delenec / delitel;
	    		System.out.println("V�sledek je: " + vysledek);
	    			}
	    	else { 
	    		System.out.println("Zadejte nenulov� hodnoty na vstupu!");
	        }
	}
}
