package demo;

public class Q10 {

	    public static void main(String[] args) {
	        
	        String input = "hello";
	        String result = "";
	        for (int i = 0; i < input.length(); i++)
	        {
	            char c = input.charAt(i); 
	            result = result + c + c; 
	        }
	          
	        System.out.println("Original String: " + input);
	        System.out.println("New String: " + result);
	    }
	}


