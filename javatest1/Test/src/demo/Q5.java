package demo;



public class Q5 {
	
	public static void main(String[] args) {
		
		        int[] numbers = {10, -45, -95, 80, -25, 30};
		        int sum = 0; 
		        for (int num : numbers) {
		            if (num < 0) {  
		                sum += num;
		            }
		        }
		        
		        
		        System.out.println("The sum of negative numbers in the array is: " + sum);
		    }
		}

	
