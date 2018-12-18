package lekce_1;

public class primeNumber {

	public static void main(String[] args) {
		int i, prvocisloOd, prvocisloDo, j, pocetZbytku;
		prvocisloOd = 0;
		prvocisloDo = 200;
		pocetZbytku = 0;
		
		for(i = prvocisloOd; i <= (prvocisloDo); i++) {
			pocetZbytku = 0;
			for(j = 1; j <= i; j++ ) {
				if(i % j == 0) {
					pocetZbytku = pocetZbytku + 1;
				}
			}
			if(pocetZbytku == 2) {
				System.out.println("Všechna prvoèísla od " + prvocisloOd + " do " + prvocisloDo + " jsou: " + i + ",");
			}
		}
	}
}

