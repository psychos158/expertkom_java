package lekce_3DU;

public class MobilePhone {

float displaySize;
int capacityOfbattery;
String brand;
String model;
boolean hasCamera;
long price;

	MobilePhone(float displaySize, int capacityOfbattery, String brand, String model, boolean hasCamera, long price)
	{
		this.displaySize = displaySize;
		this.capacityOfbattery = capacityOfbattery;
		this.brand = brand;
		this.model = model;
		this.hasCamera = hasCamera;	
		this.price = price;
	}
	
	String printInfo()
	{
		return "Mobilní telefon má následující paretry:\n Velikost displaye: " + displaySize + "\n Kapacita baterie: " + capacityOfbattery + "\n Znaèka: " + brand + "\n Model: " + model + "\n Fotoaparát: " + hasCamera + "\n Cena: " + price;                        
	}
	
	String isPhoneOn()
	{
		return "We are not stalkers, so we don't know";
	}
	
	String hasCamera()
	{
		if (hasCamera == true)
			return "Ano mobilní telefon má fotoaparát";
		else
			return "Dùchodce jako jsi ty, fotoaparát nepotøebuje!";
	}
	
	boolean isCheap()
	{
		if (brand == "iPhone") 	
		{
			return false;
		}
		else
		{	
			return true;
		}	
	}
	long getPrice()
	{
		return price;
	}
	
}
