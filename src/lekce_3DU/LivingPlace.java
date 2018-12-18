package lekce_3DU;

public class LivingPlace 
{

String city;
String street;
int area;
int floor;
boolean balcony;

	LivingPlace (String city, String street, int area, int floor, boolean balcony)
	{
		this.city = city;
		this.street = street;
		this.area = area;
		this.floor = floor;
		this.balcony = balcony;
	}
	
	String isLivingPlaceInCity(String livingPlaceCity)
	{
		
		if (livingPlaceCity == this.city)
		{
			return "Ano";
		}
		else
		{
			return "Ne";	
		}
	}
	
	int getFlorOfLivingPlace() 
	{
		return floor;
	}
	
	String hasLivingPlaceBalcony()
	{
		if (balcony == true)
		{	
			return "Ano";
		}	
		else
		{	
			return "Ne";
		}	
	}
	
	String isLivingPlaceBig()
	{
		if (area >= 100)
		{	
			return "Ano";
		}	
		else if (area < 100 && area > 0)
		{	
			return "Ne";
		}	
		else
		{	
			return "Chyba v datech. Velikost bydlení je menší nebo rovný nule";
		}	
	}
	
}
