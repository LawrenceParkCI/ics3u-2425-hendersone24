package unit1;

import java.util.Scanner;

/**
 * Date: Oct 2, 2024
 * Description: Making Labels in Java
 * @author Ethan Henderson
 */

public class MakeLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	
		
		
		String subject; 
		String name; 
		
		System.out.println("Type in the subject and pres <Enter>");
		subject = sc.nextLine();
		name = sc.nextLine();
		
		
		System.out.println();
		System.out.println("*************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("*************************");
		sc.close();
	}

}
