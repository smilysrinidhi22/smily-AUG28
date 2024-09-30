package demo;

public class Q4 {
	
	    public static void main(String[] args) {
	        
	        int[] numbers = {5, 12, 30, 47, 55};
	        
	        int searchElement = 30;
	        
	        boolean found = false;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == searchElement) {
	                System.out.println("Element " + searchElement + " found at index: " + i);
	                found = true;
	                break;
	            }
	        }

	      
	        if (!found) {
	            System.out.println("Element " + searchElement + " not found.");
	        }
	    }
	}

	


