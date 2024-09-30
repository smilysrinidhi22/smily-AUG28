package demo;

public class Q8 {
	
		public static void main(String[] args) {
	      
	        int[] array = {25, 64, 26, 86, 210};
	        int sum = 0;
	        for (int num : array) 
	        {
	            sum += num;
	        }

	        double average = (double) sum / array.length;
	        System.out.println("The average value of array elements is: " + average);
	    }

	}


