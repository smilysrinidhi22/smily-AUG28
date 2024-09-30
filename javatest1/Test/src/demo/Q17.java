package demo;

public class Q17 {

	
	    public static void main(String[] args) {
	       
	        String str = "Earth Is A  PlaNET Where People CAN  Survive ";
	        
	       
	        int uppercaseCount = 0;
	        int lowercaseCount = 0;
	      
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (Character.isUpperCase(c)) {
	                uppercaseCount++;
	            }
	           
	            else if (Character.isLowerCase(c)) {
	                lowercaseCount++;
	            }
	        }
	        
	        System.out.println("Number of uppercase letters: " + uppercaseCount);
	        System.out.println("Number of lowercase letters: " + lowercaseCount);
	    }
	}


