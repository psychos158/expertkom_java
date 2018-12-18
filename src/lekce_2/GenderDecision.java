package lekce_2;

public class GenderDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String surname = "Lama";
		if(surname.endsWith("ová")) {
			System.out.println("Možná je to žena");
		}
		else {
			System.out.println("Možná je to muž, možná žena a možno ono");
		}
	}

}
