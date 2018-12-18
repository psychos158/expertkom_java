package lekce_1;

public class test {
	

        public static void main(String[] args) {
                    
                int odcisla = 2;
                int docisla = 100;
                int zbytek = 0;
                int pocetZbytku = 0;
                
                for (int x = odcisla; x <= docisla; x++) {
                	pocetZbytku = 0;
                        for (int z = 1; z <= x; z++) {
                                zbytek = x%z;
                                if (zbytek == 0) {
                                	pocetZbytku = pocetZbytku + 1;
                                }
                        }
                        if (pocetZbytku == 2) {
                                System.out.print(x + ", ");
                        }
                }
        }
}


