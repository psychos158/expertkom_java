package lekce_2;

public class mocnina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cislo; 
		int umocneneCislo;
		umocneneCislo = 0;
		cislo = 0;
		while(umocneneCislo < 100) 
		{
			umocneneCislo = cislo * cislo;
			System.out.print(cislo + ",");
			cislo = cislo + 1;
		}
	}

}
