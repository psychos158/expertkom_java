package lekce_2DU.copy;

import java.util.Scanner;

public class IsPrimeNumber 
{
	
	public static void main(String[] args) 
	{
		int chosenPrimeNumber;
		int j;
		int pocetZbytku = 0;
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte èíslo k ovìøení: ");
		chosenPrimeNumber = sc.nextInt();
		sc.close();
				
		for(j = chosenPrimeNumber; j > 0 ; j-- )
		{
			if(chosenPrimeNumber % j == 0)
			{
				pocetZbytku = pocetZbytku + 1;
			}
		}
		if(pocetZbytku == 2) 
		{
			System.out.println(chosenPrimeNumber + " je prvoèíslo!");
		}
		else
		{
			System.out.println(chosenPrimeNumber + " není prvoèíslo!");
		}
	}
}
