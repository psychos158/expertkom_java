package lekce10;

import java.util.List;

public class MovieMaker {

	String pathToFolder;

	public MovieMaker(String pathToFolder) {
		super();
		this.pathToFolder = pathToFolder;
	}
	
	public void runMovieKeeper() {
		introduceMovieKeeper();
		List<String> allTxtFilesList = FilesFinder.searchForTXTFilesInFolder(this.pathToFolder);
		if(allTxtFilesList.isEmpty()) {
			administrateEmptyFolder();
		}
		else {
			administrateNoEmptyFolder();
		}
	}
	
	private void administrateEmptyFolder() {
		informAboutEmptyFolder();
		String userChoice = Input.getStringAnswerFromTheUser();
		if(userWishesIsNewFile(userChoice)) {
			creteNewFile();
			runMovieKeeper();
		}
		else if(userWishesEnd(userChoice)) {
			informAboutEnd();
		}
		else {
			requestValidAnswer();
			runMovieKeeper();

		}
	}

	private void administrateNoEmptyFolder() {
		List<String>allTxtFilesInFolder = FilesFinder.searchForTXTFilesInFolder(pathToFolder);
		FilesFinder.printOutAllTXTFiles(allTxtFilesInFolder);
	}
	
	private void introduceMovieKeeper() {
		System.out.println("Hello, I am Movie Keeper! I am the best for storing the movie metadata :)");
	}
	
	private void informAboutEmptyFolder() {
		System.out.println("Adresáø je prázdný. Zdejte \"N\" pro nový nebo \"K\" pro konec\n");
	}
	
	private boolean userWishesIsNewFile(String userChoice) {
		return userChoice.equals("N") || userChoice.equals("n");
	}
	
	private void creteNewFile() {
		System.out.println("Zadejte název Vašeho souboru: \n");
		String newFileNameFromUser = Input.getStringAnswerFromTheUser();
		String pathToFile = createPathToNewFile(newFileNameFromUser);
		Writer.writeToNewFile(pathToFile, "");
	}
	
	private String createPathToNewFile(String newFileNameFromUser) {
		String pathToFile = this.pathToFolder+"\\" + newFileNameFromUser+".txt";
		return pathToFile;
	}

	private boolean userWishesEnd(String userChoice) {
			return userChoice.equals("K")|| userChoice.equals("k");
	}
	
	private void informAboutEnd() {
		System.out.println("KONEC!");
	}
	
	private void requestValidAnswer() {
		System.out.println("Neplatná možnost, zdejte \\\"N\\\" pro nový nebo \\\"K\\\" pro konec\\n\"");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	/*
	String pathToFolder;

	public MovieMaker(String pathToFolder) {
		super();
		this.pathToFolder = pathToFolder;
	}
	
	public void runMovieKeeper() {
		List<String>txtFilesInFolder = FilesFinder.searchForTXTFilesInFolder(pathToFolder);
		if (txtFilesInFolder.isEmpty()) {
			System.out.println("Zadejte název souboru ");
			String fileName = Input.getStringAnswerFromTheUser();
			fileName = pathToFolder + "\\" + fileName + ".txt";
			System.out.println("Zadejte, co chcete do souboru zapsat ");
			String somethignToWrite = Input.getStringAnswerFromTheUser();
			Writer.writeToNewFile(fileName, somethignToWrite);
		}
		else {
			FilesFinder.printOutAllTXTFiles(txtFilesInFolder);
			
		}	
	}
	*/
	
	
	
	
	

