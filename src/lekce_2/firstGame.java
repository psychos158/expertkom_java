package lekce_2;

import java.io.IOException;

public class firstGame {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		char theAnswer;
		theAnswer = 'k';
		
		System.out.println("Stiskn�te kl�vesu k a pak enter: ");
		char keyboardEntry = ' ';
			while (keyboardEntry != theAnswer)
			{	
				keyboardEntry = (char) System.in.read();
				if(keyboardEntry == theAnswer) 
				{
					System.out.println("Spr�vn� odpov��");
				}
			else
			{
				System.out.println("�patn� odpov��");
			}
			}
	}

}