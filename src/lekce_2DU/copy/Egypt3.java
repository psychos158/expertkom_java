package lekce_2DU.copy;

public class Egypt3 
{

	public static void main(String[] args) 
	{
		int pocetRadku = 9;
		int mezery = 10;
		int cislo = 1;
		int cisloDo=2;
		int spaceCounter = 10;

		for (pocetRadku = 9; pocetRadku > 0; pocetRadku--)
		{
			for(mezery = spaceCounter; mezery > 0; mezery--)
			{
				System.out.print(" ");	
			}	
				for(cislo = 1; cislo < cisloDo ; cislo++) 
				{
					System.out.print("*" + " " );
					
				}
				System.out.print("\n");
				
				cisloDo++;		
			spaceCounter--;
		}
	}
}




