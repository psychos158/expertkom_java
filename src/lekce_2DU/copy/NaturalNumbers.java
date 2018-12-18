package lekce_2DU.copy;

import java.util.Scanner;

public class NaturalNumbers 
{

	public static void main(String[] args) 
	{
		
		int naturalNumber;
		int result = 0;
		int result2 = 0;
		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Zadejte pøirozené èíslo ");
		naturalNumber = sc.nextInt();
		sc.close();
		int j = naturalNumber / 2;
		
		
		
		
		for (naturalNumber = 1, j=100; naturalNumber <= 50; naturalNumber++, j--)
		{
			result = naturalNumber + j;
			result2 = result + result2;
			
		}
		System.out.println("Výsledek souètu prvních 100 pøirozených èísel je: " + result2);
	}

}
