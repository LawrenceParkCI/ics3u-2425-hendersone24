package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		
		//The value displayed is $11.3
		
		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $"); 
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + money.format(total));
		
		
		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		
		//The new output is 11.30, it changes the decimal format 
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		
		//It adds a $ sign at the front
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		
		//It changes the .30 to .3
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 
		//Run the program again with the cost of 10.50, what is happening?
		
		//It displays $22.36 as now 10.50 has been multiplied by 1.13 opposed to 0.13
		
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		
		//It multiplies this sequence of numbers by 1.13, as previously inputed. 
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		
		//Output is: $139,505,28 - Seperates the number groups (ex. the hundreds) and multiplies by 0.13 
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		System.out.println("The tax rate is " + TAX_RATE);
		
		//Tax rate value is printed as 0.13
		
		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//It prints the 0.13 as the number 13 with a percent sign - 13%
		
		sc.close();
	}

}
