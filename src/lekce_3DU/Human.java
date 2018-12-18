package lekce_3DU;

public class Human 
{
	int id;
	String firstname;
	String surname;
	int age;
	String gender;
	int high;
	double weight;
	String city;
			
	Human(int id, String firstname, String surname, int age, String gender, int high, int weight, String city)
	{
		this.id = id;	
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.high = high;
		this.weight = weight;
		this.city = city;
	}	

	double getWeightOnMoon()
	{
		double weightOnMoon = 0.17;
		return weight * weightOnMoon;
	}	

	int ageIn2050(int age) 
	{
		return age + 32;
	}

	String printInfo()
	{
	return "ID je: " + id + "\nJméno je: " + firstname + "\nPøíjmení je: " + surname;			
	}
	
	String getFirstname() 
	{
		return firstname;
	}
	
	String isThisCityRight(String city)
	{
		if (city == this.city)
		{
			return "Ano";
		}
		else
		{
			return "Ne";
		}		
	}
	String isThisCityRightTernaryOperator(String city) {
		return city == this.city ? "Ano" : "NE";
	}
	}