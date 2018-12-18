package lekce_2DU.copy;

public class SequenceOfNumbers 
{
	public static void main(String[] args) 
	{
		int i;
		int posloupnostOd = 1;
		int posloupnostDo = 64;
		int cislo;
		cislo = posloupnostOd;
		
		for(i = posloupnostOd; i <= posloupnostDo; i=cislo)
		{
			if(cislo < posloupnostDo)
			{	
			System.out.print(cislo+", ");
			cislo = cislo * 2;
			}
			else 
			{
				System.out.print(cislo+". ");
				cislo = cislo * 2;
			}
		}	
	}
}
