package demo;

public class Q2 {
	

	    public static void main(String[] args) {
	        
	        int[] numbers = {10, 23, 45, 62, 12, 18, 31, 42};
	        
	        System.out.println("Even numbers in the array are:");
	        
	        for (int num : numbers) 
	        {
	            if (num % 2 == 0) 
	            { 
	                System.out.println(num);
	            }
	        }
	    }
	}


