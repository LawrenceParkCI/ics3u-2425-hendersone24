package unit1;

import java.util.Scanner;

/**
 * Description: Manipulating Strings
 * Oct 8, 2024
 * @author Ethan Henderson
 */
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		 System.out.println("Input String");
		 String myString = sc.next();
		 System.out.println(myString);
		 System.out.println(myString.toUpperCase()); 
		 System.out.println(myString.toLowerCase()); 
		 System.out.println(myString.length()); 
		 System.out.println(myString.charAt(5)); 
		 
		 //Bonus
		 System.out.println(myString.charAt(0)); 
		 System.out.println(myString.substring())
	}

}
