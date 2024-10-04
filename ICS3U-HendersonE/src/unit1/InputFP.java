package unit1;
/**
 * Date: Oct 4, 2024
 * Description: InputFP
 * @author Ethan Henderson
 */

import java.util.Scanner;

public class InputFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//declare variables
		double num1, num2;
		
		
		//your input
		System.out.println("Type me in one floating point number");
		num1 = sc.nextDouble();
		System.out.println("Type me another foating point number");
		num2 = sc.nextDouble();
				
		//print the output
		System.out.println();
		System.out.println("The first numbe entered was " + num1);
		System.out.println("The second number entered was " + num2);
	}

}
