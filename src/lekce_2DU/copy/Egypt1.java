package lekce_2DU.copy;

public class Egypt1 
{
	public static void main(String[] args) 
	{
		int pocetRadku;
		
		int cislo = 1;
		int mezery;
		int tiskcisla = 1;
		int cisloDo=2;
		int spaceCounter = 10;
		for (pocetRadku=9; pocetRadku > 0; pocetRadku--)
		{
			for(mezery = spaceCounter; mezery > 0; mezery--)
			{
				System.out.print(" ");	
			}	
				for(cislo = 1; cislo < cisloDo ; cislo++) 
				{
					System.out.print(tiskcisla + " " );
				}
				System.out.print("\n");
				tiskcisla = tiskcisla+1;
				cisloDo++;		
			spaceCounter--;
		}
	}
}




