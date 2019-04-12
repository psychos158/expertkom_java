package lekce9;

public class Dividing {
	int number[];
	int delitel[];
	int vysledek;
	
	public Dividing (int[] number, int[] delitel) {
		
		super();
		this.number = number;
		this.delitel = delitel;
	}
	
	public void devide() {
		for (int n = 0; n < this.number.length; n++) {
			int a = 0;
			
			try {
				vysledek = n/delitel[a];	
			}
			catch(ArithmeticException exc) {
				System.out.println("Nulou dìlit nelze!");
			}
			a++;	
			}			
		}	
	}

