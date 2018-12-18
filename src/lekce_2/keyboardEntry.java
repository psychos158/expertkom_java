package lekce_2;

import java.io.IOException;

public class keyboardEntry {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Stisknìte klávesu a enter: ");
		char keyboardEntry = (char) System.in.read();
		System.out.println("stiskli jste " + keyboardEntry);
	}

}
