package arraySort;

import java.util.Arrays;

public class ArraySort {
	// kiem tra key nam o vi tri thu bao nhieu trong mang
	public static int search(int array[], int key) {
		for(int i = 0 ; i < array.length; i++) {
			if(array[i] == key)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int a1[] = new int[] {3,6,2,9,5,8,1};
		// before sort
		for(int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		Arrays.sort(a1);
		System.out.println("\n----------------");
		// after sort
		for(int i = 0 ; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println("\n----------------");
		// search
		int indexValue = search(a1, 9);
		if(indexValue == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found and is at in index" + " " +  indexValue);
		
		/* 
		 * Input 1 2 3 5 6 8 9  -----> call search(a1, 9) ----> key : 9 
		 * Output : index : 6
		 * */
	}
}
