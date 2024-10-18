package unit1;

import java.util.Scanner;

/**
 * Description: Grocery Store System
 * Date: Oct 18, 2024
 * @author Ethan Henderson
 */

public class GroceryShopping {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		final double tax = 0.13; 
		
		System.out.print("What would you like to buy?");
		String product = sc.nextLine();	
		
		System.out.print("How much does it cost?");
		double price = sc.nextDouble();
		
		System.out.print("How many will you be buying?");
	    int quantity = sc.nextInt(); 
	    
	    var totalAmount = (price * quantity); 
	    System.out.print("Your Total Amount Due:" + totalAmount + (totalAmount * tax));
	    
	    
	    
	
	}

}
