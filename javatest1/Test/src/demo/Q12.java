package demo;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.nextLine();
		System.out.println("Enter second String");
		String s2=sc.nextLine();
		if(s1.endsWith(s2))
		{
			System.out.println("The string \"" + s1 + "\" ends with \"" + s2 + "\".");
		}
		else
		{
			System.out.println("The string \"" + s1 + "\" does not ends with \"" + s2 +"\".");
		}

	}
}
