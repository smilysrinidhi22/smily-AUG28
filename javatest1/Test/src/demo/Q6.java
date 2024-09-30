package demo;

import java.util.HashSet;

public class Q6 {

	public static void main(String[] args) {
		

		int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6};
		HashSet<Integer> uniqueElements = new HashSet<>();

		for (int num : array) {
			
		    uniqueElements.add(num);  
		}
		System.out.println("Unique elements in the array are: " + uniqueElements);

	}
}
