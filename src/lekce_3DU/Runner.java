package lekce_3DU;

public class Runner {

	public static void main(String[] args) {
		Human honza = new Human(1, "Honza", "Sterba", 25, "Muž", 178, 68, "Teplice");
		Human petr = new Human(2, "Petr", "Vopièka", 12, "Muž", 178, 30, "Praha");
		Car mitsubushi = new Car(1, "SUV", "ASX", 120, 620000, "Bílá" );
		Car honda = new Car(2, "Sedan", "Civic", 90, 520000, "Zlatá" );
		LivingPlace vinohrady = new LivingPlace("Praha", "Jana Masaryka", 90, 3, false);
		LivingPlace andel = new LivingPlace("Praha", "Vrázova", 0, 1, false);
		LivingPlace budejarna = new LivingPlace("Praha", "Jeremenkova", 35, 1, true);
		MobilePhone honor = new MobilePhone(5.5f, 3800, "Honor", "8", true, 8000);
		MobilePhone aligator = new MobilePhone(4.3f, 2200, "Aligator", "8", true, 2500);
		MobilePhone iPhone = new MobilePhone(5f, 3450, "iPhone", "10XR", true, 35000);
		MobilePhone nokia = new MobilePhone(1.83f, 3450, "Nokia", "5310", false, 17000);
		
		
		int carCount = 5;
		String city = "Teplice";
		String livingPlaceCity = "Teplice";
		double honzaWeightOnMoon = honza.getWeightOnMoon();
		double petrWeightOnMoon = petr.getWeightOnMoon();
		String honzaInfo = honza.printInfo();
		String honzaCar = mitsubushi.printInfo();
		double totalPriceForMitsubishi = mitsubushi.getTotalPrice(carCount);
		String honzacity = honza.isThisCityRight(city);
		String honzacityTernary = honza.isThisCityRightTernaryOperator(city);
		String isMitsubishiColorNice = mitsubushi.isCarColorNice();
		String mitsubushiColor = mitsubushi.getColor();
		String hondaColor = honda.getColor();
		String livingPlaceBudejarna = budejarna.isLivingPlaceInCity(livingPlaceCity);
		String livingPlaceAndel = andel.isLivingPlaceInCity(livingPlaceCity);
		String livingPlaceVinohrady = vinohrady.isLivingPlaceInCity(livingPlaceCity);
		int andelFloor = andel.getFlorOfLivingPlace();
		String isLivinPlaceOnAndelBig = andel.isLivingPlaceBig();
		String honorInfo = honor.printInfo();
		String aligatorInfo = aligator.printInfo();
		long iPhonePrice = iPhone.getPrice();
		boolean isIphoneCheap = iPhone.isCheap();
		String hasNokiaCamera = nokia.hasCamera();
		
		
		System.out.println(honzaInfo);
		System.out.println("Honzíkova váha na mìsíci je: " + honzaWeightOnMoon + " Kg.");
		System.out.println("Petrova váha na mìsíci je: " + petrWeightOnMoon + " Kg.");
		System.out.println("Honza má následující auto: \n" + honzaCar);
		System.out.println("Celková cena za " + carCount + " Mitsubishi je: " + totalPriceForMitsubishi + "." + "Kè");
		System.out.println("Je mìsto správné? " + honzacity);
		System.out.println("Øešeno ternárním operátorm.. Je mìsto správné? " + honzacityTernary);
		System.out.println("Je barva mitsubishi hezká? " + isMitsubishiColorNice);
		System.out.println("Barva mitsubishi je: " + mitsubushiColor);
		System.out.println("Barva hondy je: " + hondaColor);
		System.out.println("Bydlí v " + livingPlaceCity + "? " + livingPlaceBudejarna);
		System.out.println("Bydlí v " + livingPlaceCity + "? " + livingPlaceAndel);
		System.out.println("Bydlí v " + livingPlaceCity + "? " + livingPlaceVinohrady);
		System.out.println("Patro: " + andelFloor);
		System.out.println("Je byt na Andìlu velký? " + isLivinPlaceOnAndelBig);
		System.out.println("Info o honoru: " + honorInfo);
		System.out.println("Info o aligatoru: " + aligatorInfo);
		System.out.println("Cena iPhonu je: " + iPhonePrice);
		System.out.println("Je iPhone levný? " + isIphoneCheap);
		System.out.println("Má nokia fotoaparát? " + hasNokiaCamera);
	}

}
