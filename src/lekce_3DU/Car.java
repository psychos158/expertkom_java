package lekce_3DU;

public class Car {
	int id;
	String type;
	String model;
	int enginePowerInKW;
	double price;
	String color;
	double totalPrice;
	
	Car(int id,	String type, String model, int enginePowerInKW,	long price,	String color)
	{
		this.id = id;
		this.type = type;
		this.model = model;
		this.enginePowerInKW = enginePowerInKW ;
		this.price = price;
		this.color = color;
	}

	void countTotalPrice(int amount)
	{
		// Plná cena do 2 kusù vèetnì
		if(amount <=2) {
			totalPrice = amount * price;
		}
		// 5% sleva pro 3-5 kusù
		else if (amount > 2 && amount <=5) 
		{
			totalPrice = amount * price * 0.95;
		}
		// 10% sleva pro 6 a více kusù
		else 
		{
			totalPrice = amount * price * 0.9;
		}
	}
	
	double getTotalPrice(int amount) {
		countTotalPrice(amount);
		return totalPrice; //Takhle je to myšleno z pohledu clen-code? zavolám metodu, která mi vypoèítá totalPrice a zde už nic nepoèítám, jen vracím výsledek? 
	}
	
	String printInfo() 
	{
		return "ID je: " + id + "\nTyp je: " + type + "\nmodel je: " + model;
	}
	
	String isCarColorNice()
	{
		if (this.color != "Rùžová")
		{	
			return "Ano"; // tohle není úplnì clean-code, protože tu mám nìjakou podmínku a ještì nìco vracím? Správnì bych ten string "Ano" mìl uložit do promìnné tuto metodu zavolat z jiné metody, která jen vrátí co je v promìnné? 
		}	
		else
		{
			return "Ne";
		}	
	}
	String getColor()
	{
		return Car.this.color;
	}
	
	
}
