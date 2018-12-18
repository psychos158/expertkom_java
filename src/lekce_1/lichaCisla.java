package lekce_1;

public class lichaCisla {

	public static void main(String[] args) {
		int count;
		int a, b;
		a = 1;
		b = 200;
		for(count=a; count <= b; count++) {
			if(count % 2 != 0) {
				System.out.println("Všechna lichá èísla od " + a + " do" + b + " jsou: " + count);
			}
		
		}
	}

}
