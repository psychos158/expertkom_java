package lekce3;

public class Runner1 {

	public static void main(String[] args) {
		Product bananekVcokolade = new Product(10,"Banánek v èokoládì", 10, "kg", 500);
		
		float priceOfBananekVcokolade = bananekVcokolade.getPrice();
		int amount = 5;
		
		
		float totalPriceOfBananekVcokolade = bananekVcokolade.getTotalPrice(amount);
		
		System.out.println(bananekVcokolade.name);
		System.out.println(priceOfBananekVcokolade);
		System.out.println(totalPriceOfBananekVcokolade);
	}
}

