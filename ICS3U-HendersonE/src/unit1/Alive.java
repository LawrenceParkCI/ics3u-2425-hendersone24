package unit1;
/**
 * Description: My days alive and hours slept
 * Oct 8, 2024
 * @author Ethan Henderson
 */

import java.util.Scanner;

public class Alive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Alive - Part 2
		
		Scanner sc = new Scanner(System.in);
		
		 //Past
		System.out.println("Enter your birth year, birth month, and birthday"); 
		System.out.println("Birth Year:");
		int birthYear = sc.nextInt();
		
		System.out.println("Birth Month:");
		int birthMonth = sc.nextInt(); 
		
		System.out.println("Birth Day:");
		int birthDay = sc.nextInt();
		
		//Today
		System.out.println("Present Year:");
		int presentYear = sc.nextInt();
		
		System.out.println("Present Month:");
		int presentMonth = sc.nextInt();
		
		System.out.println("Present Day:");
		int presentDay = sc.nextInt();
		
		System.out.println("My Average Sleep:");
		int dailySleep = sc.nextInt();
		
		
		
		
		//Days Alive
        //int birthYear = 2008;
        //int birthMonth = 7;
        //int birthDay = 3; 
        //int dailySleep = 8; 
        
        //int presentYear = 2024; 
        //int presentMonth = 10; 
        //int presentDay = 8; 
        
        int daysAlive; 
        daysAlive = (presentYear - birthYear) * 365 + ((presentMonth - birthMonth) * 30) + presentDay - birthDay; 
        System.out.println("You have been alive for " + daysAlive + "days in total"); 
        
        int hourssSlept = dailySleep * daysAlive;  
        System.out.println("You've slep for " + hourssSlept + "in total");
        
        System.out.println();
        
        
	}

}
