package lekce_1;

public class forCycle {
	public static void main(String[] args) {
		//vypist� v�echna sud� ��sla od 1 do 200
		int count;
		int a, b;
		a = 1;
		b = 200;
		for(count=a; count <= b; count++) {
			if(count % 2 == 0) {
				System.out.println("V�echna sud� ��sla od " + a + " do" + b + " jsou: " + count);
			}
		
		}
		}
}
