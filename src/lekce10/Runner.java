package lekce10;

public class Runner {

	public static void main(String[] args) {
		// 
		String pathToFolder = "E:\\Pracovní\\školení\\JAVA Univerzity\\lekce10_MovieKeeper";
		MovieMaker keeper = new MovieMaker(pathToFolder);
		keeper.runMovieKeeper();

	}

}
