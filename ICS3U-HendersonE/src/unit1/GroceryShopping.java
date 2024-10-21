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
		
		//First Item 
	
		System.out.println("|| $$$ \\\\\\ ========== \"Mr. Henderson's Groceries\" ========== /// $$$ ||"); 
		System.out.println(); 
		
		System.out.println("First Item: \n");
		System.out.print("What would you like to buy?");
		String product = sc.nextLine();	
		
		System.out.print("How much does it cost?");
		double price = sc.nextDouble();
		
		System.out.print("How many will you be buying?");
	    int quantity = sc.nextInt(); 
	    
	    var totalAmount = (price * quantity); 
	    System.out.print("Your Total Amount Due:" + totalAmount + (totalAmount * tax));
	    
	    //Second Item
	    
	    System.out.println(); 
	    
	    System.out.println("Item 2: \n"); 
	    System.out.println(); 
	    
	    System.out.println("What would you like to buy?"); 
	    String product2 = sc.next();
	    
	    System.out.print("How much does it cost?");
		double price2 = sc.nextDouble();
	    
		System.out.print("How many will you be buying?");
	    int quantity2 = sc.nextInt(); 
	    
	    var totalAmount2 = (price2 * quantity2); 
	    System.out.print("Your Total Amount Due:" + totalAmount2 + (totalAmount2 * tax));
	    
	    //Receipt 
	    
	   System.out.printf("$65s", "This is your recipt /n"); 
	   System.out.printf("$75s", "Item      |  Price  | Quant. | Total Price "); 
	   System.out.printf("$63s", "------------------------------------------");
	   System.out.printf("%32s %11s %10s %14s ");

	
	}

}
