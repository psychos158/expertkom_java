package lekce5;

public class Example {
	public void demonstrateObjectReference() {
	
	int i;
	
	int nums1[] = new int [10];
	int nums2[] = new int [10];
	
	nums1 = setValuesForArray(nums1);
	nums2 = setMinusValuesForArray(nums2);
	
	printArray(nums1);
	printArray(nums2);
	nums2 = nums1;
	printArray(nums2);
	nums2[3] = 99;
	printArray(nums1);
}


	public void printArray(int[] pole) {
		int i;
		System.out.print("Printing an array: ");
		for(i=0; i<10; i++) {
			System.out.print(pole[i] + " ");
		}
		System.out.println();
	}


	public int[] setValuesForArray(int[] nums1) {
		int i;
		int nums[] = new int[10];
		for(i=0; i < 10; i++) {
			nums[i] = i;  
		}
		return nums; //nuly byly ti�t�ny proto, �e po napln�n� pole s n�zvem "nums" jsem vracel pole s n�zvem nums1, kter� napln�no nebylo. 
	}
	
	public int[] setMinusValuesForArray(int[] nums2) {
		int i;
		int nums[] = new int[10];
		for(i=0; i<10; i++) { 
			nums[i] = -i;
		}
		return nums;
	}
}
