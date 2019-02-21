package lekce8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

	List<String> ListOfAnswers = Arrays.asList("kamen","nuzky", "papir");
	private Scanner scan;

	public void palyGame() {
	
		while(true) {
			String kamen = "kamen";
			String nuzky = "nuzky";
			String papir = "papir";
			String tapir = "tapir";
			String spock = "spock";		
			String konec = "konec";
		
			System.out.println("\nZadejte \"kamen\", \"nuzky\", \"papir\", \"tapir\", \"spock\" nebo pro ukon�en� hry \"konec\": ");
			String playerAnswer = getAnswerFromThePlayer();
			String rndComputerAnswer = getRandomAnswerFromComputer();
			
			
			if(playerAnswer.equals(kamen)|| playerAnswer.equals(nuzky) || playerAnswer.equals(papir)|| playerAnswer.equals(tapir) || playerAnswer.equals(spock)) {
				if(playerAnswer.equals(rndComputerAnswer)) {
					// rem�za
					System.out.println("V�sledek: Rem�za. Oba hr��i hr�li " + playerAnswer+ ".");
				}
				else if((playerAnswer.equals(kamen) && rndComputerAnswer.equals(nuzky))	|| 
						(playerAnswer.equals(nuzky) && rndComputerAnswer.equals(papir)) || 
						(playerAnswer.equals(papir) && rndComputerAnswer.equals(kamen)) ||
						(playerAnswer.equals(tapir) && rndComputerAnswer.equals(spock)) ||
						(playerAnswer.equals(spock) && rndComputerAnswer.equals(nuzky)) ||
						(playerAnswer.equals(nuzky) && rndComputerAnswer.equals(tapir)) ||
						(playerAnswer.equals(tapir) && rndComputerAnswer.equals(papir)) ||
						(playerAnswer.equals(papir) && rndComputerAnswer.equals(spock)) ||
						(playerAnswer.equals(spock) && rndComputerAnswer.equals(kamen))){
					//player vyhr�v�
					System.out.println("V�sledek: Hr�� v�t�z�. Hr�� hr�l " + playerAnswer + "." + " Po��ta� hr�l " + rndComputerAnswer + ".");	
				}
				else {
					System.out.println("V�sledek: Po��ta� v�t�z�. Hr�� hr�l " + playerAnswer + "." + " Po��ta� hr�l " + rndComputerAnswer + ".");
				}
			}
			else if (playerAnswer.equals(konec)) {
				break;
			}
				
			else {
				System.out.println("Nevalidn� odpov��");	
			}	
		}
	}
	
	private String getAnswerFromThePlayer() {
		scan = new Scanner(System.in);
		String answer = scan.nextLine();
		return answer;
	}
	
	private String getRandomAnswerFromComputer() {
		Random rand = new Random();
		String rndComputerAnswer = ListOfAnswers.get(rand.nextInt(ListOfAnswers.size()));
		return rndComputerAnswer;
		
	}
}
