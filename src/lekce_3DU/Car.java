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
		// Pln� cena do 2 kus� v�etn�
		if(amount <=2) {
			totalPrice = amount * price;
		}
		// 5% sleva pro 3-5 kus�
		else if (amount > 2 && amount <=5) 
		{
			totalPrice = amount * price * 0.95;
		}
		// 10% sleva pro 6 a v�ce kus�
		else 
		{
			totalPrice = amount * price * 0.9;
		}
	}
	
	double getTotalPrice(int amount) {
		countTotalPrice(amount);
		return totalPrice; //Takhle je to my�leno z pohledu clen-code? zavol�m metodu, kter� mi vypo��t� totalPrice a zde u� nic nepo��t�m, jen vrac�m v�sledek? 
	}
	
	String printInfo() 
	{
		return "ID je: " + id + "\nTyp je: " + type + "\nmodel je: " + model;
	}
	
	String isCarColorNice()
	{
		if (this.color != "R��ov�")
		{	
			return "Ano"; // tohle nen� �pln� clean-code, proto�e tu m�m n�jakou podm�nku a je�t� n�co vrac�m? Spr�vn� bych ten string "Ano" m�l ulo�it do prom�nn� tuto metodu zavolat z jin� metody, kter� jen vr�t� co je v prom�nn�? 
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
