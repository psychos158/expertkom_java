package lekce3;

public class Product {

		int id;
		String name;
		int volume;
		String volumeUnit;
		float price;
		float totalPrice; 
		
		
		Product(int id,	String name, int volume, String volumeUnit, float price){
			this.id = id;
			this.name = name;
			this.volume = volume;
			this.volumeUnit = volumeUnit;
			this.price = price;
			
		}
		
		float getPrice(){
			return price;
		}
		
		void countTotalPrice(int amount) {
			totalPrice = amount * price;			
		}
		
		float getTotalPrice(int amount) {
			countTotalPrice(amount);
			return totalPrice;
		}
}
