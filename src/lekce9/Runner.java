package lekce9;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Info infoAboutMe1 = new Info();
 int age = 25;
 String name = "Jan";
		 
 infoAboutMe1.InfoAboutMe(age);
 infoAboutMe1.InfoAboutMe(name);
 
 int[] number = {10, 1, 5, 8};
 int[] delitel = {2, 0, 5, 4};
 
 Dividing deleni = new Dividing(number, delitel);
 deleni.devide();
 
 
	}

}
