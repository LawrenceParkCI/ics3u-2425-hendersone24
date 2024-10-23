package unit1;


import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		
		//Final Total Format
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		//First Item Purchase
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
	    System.out.print("Your Total Amount Due: "+ totalAmount + (totalAmount * tax));
	    
	    //Second Item Purchase
	    System.out.println("\n"); 
	    
	    System.out.println("Second Item: "); 
	    System.out.println(); 
	    
	    System.out.print("What would you like to buy?"); 
	    String product2 = sc.next();
	    
	    System.out.print("How much does it cost?");
		double price2 = sc.nextDouble();
	    
		System.out.print("How many will you be buying?");
	    int quantity2 = sc.nextInt(); 
	    
	    var totalAmount2 = (price2 * quantity2); 
	    System.out.print("Your Total Amount Due:  " + totalAmount2 + (totalAmount2 * tax));
	    System.out.println("\n");
	    
	    //System Results
	    var subtotal = (totalAmount + totalAmount2); 
	    var finaltax = (tax * (totalAmount + totalAmount2)); 
	    var total = (finaltax + subtotal); 
	 
	   //The Receipt 
	   System.out.printf("\n", "\n");
	   System.out.printf("%20s", "This is your recipt: \n");
	   
	  System.out.printf("%25s \n", dateTimeFormat.format(LocalDateTime.now()));
	   System.out.printf("%70s", "Item  |  Price   | Quant   | Total Price \n"); 
	   System.out.printf("%70s", "--------------------------------------------- \n");
	   System.out.printf("%32s  | %7s  | %6s  | %7s \n", product, price, quantity, totalAmount);
	   System.out.printf("%32s  | %7s  | %6s  | %7s \n", product2, price2, quantity2, totalAmount2);
	   System.out.printf("%70s", "--------------------------------------------- \n");
	   System.out.printf("%58s %9s \n", "Subtotal: ", money.format(subtotal)); 
	   System.out.printf("%58s %9s \n", "Tax Due: ", money.format(finaltax));
	   System.out.printf("%58s %9s \n", "Total: ", money.format(total));
	   
	   long totalRounded = Math.round(total); 
	   System.out.println("This is approximatley: $" + totalRounded);
	   
	   System.out.println("\n");
	   System.out.println("Have a good day! \n");
	   System.out.println("Thanks for shopping at Mr. Henderson's Groceries!");
	   
	   
	}

}
