package lekce_2DU.copy;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in, "Windows-1250");
		int chosenNumber;
		System.out.println("Zadejte èíslo pro výpoèet faktoriálu: ");
		chosenNumber = sc.nextInt();
		sc.close();
		int printedChosenNumber = chosenNumber;
		int factorialResult = 0;
		int factorialResult2 = 1; 
		int number = chosenNumber - 1;
		while(number >= 1)
		{
			if(number + 1 == chosenNumber)
			{	
				factorialResult = chosenNumber * number;
				factorialResult2 = factorialResult * factorialResult2;
				number = number - 1;
			}
			else
			{
				factorialResult2 = factorialResult2 * number;
				number = number - 1;
			}
		}	
		System.out.println("Faktoriál èísla " + printedChosenNumber + " je: " + factorialResult2);
	}
}




