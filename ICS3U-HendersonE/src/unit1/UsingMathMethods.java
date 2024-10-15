package unit1;

import java.util.Scanner;

public class UsingMathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
	 
		  double num;
		  
		  System.out.println("Part A");
		  
		  //Write code to ask the user for any real number to be input.
		  //Store their input into the num variable
		  
		  System.out.println("Input number:");
		  num = sc.nextDouble();
		  
		  System.out.println(Math.round(num));
		  System.out.println(Math.rint(num));
		  System.out.println(Math.sqrt(num));
		  System.out.println(Math.abs(num));
		  System.out.println(Math.pow(num, 2));
		  System.out.println(Math.pow(num, num));
		  System.out.println(Math.pow(num, 3));
		  
		  /*
		   * Run the program and write down the output that is produced
		   * when each of the following values are input:
		   * 
		   *      num = 16.75  | num = 4.0  | num = -23.45
		   *      -----------------------------------------------
		   * Math.round(num)  17   |    4 | -23
		   * Math.rint(num)   17.0  |  4.0    | -23.0
		   * Math.sqrt(num)    4.09 |  2.0  | NaN
		   * Math.abs(num)    16.75 | 4.0   | 23.45
		   * Math.pow(num, 2)  280.56   | 16.0    | 549.90
		   * Math.pow(num, num)  3.17  |  256.0  | NaN
		   * Math.pow(num, 3)     4699.42 | 64.0   | - 12895.21
		   * 
		   */
		  
		  //Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		  //Nan stands for Not a number!
		  
		  //Because you cannot square root a negative number.
		  
		  //In your own words describe what the following Math methods does
		  /*
		   * round: Rounds to the nearest whole number, into Int
		   * rint: Rounds to the nearest whole number, into a floating point
		   * sqrt: Square roots the number
		   * abs: Removes/cancels out negatives attached to the number
		   * pow: Powers the number to the exponent (ex. squared (2), cubed (3)
		   */
		  
		  //The methods round, sqrt and abs only have one parameter (which is in the brackets).
		  //Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		  
		   //It takes the first number, and multiplies it by the exponent in the second position
		  
		  System.out.println("Part B");
		  //Ask the user for any real number and an integer to be input. Display the real number,
		  //and its square root. Also determine and display the real number raised to the integer power.
		  //Use suitable headings, displaying the results across the screen.\
		  //
		  //Eg. If the real number 13.5 and the integer 2 are input, display
		  //REAL NUMBER SQUARE ROOT  RAISED TO POWER 2 <- display power here
		  //   13.5     3.6742   182.25
		  
		  System.out.println("Input a real number");
		  double num2 = sc.nextDouble();
		  System.out.println("Input another real number"); 
		  double num3 = sc.nextDouble(); 
		  double stepOne = (Math.sqrt(num2));
		  double stepTwo = (Math.pow(stepOne, num3)); 
		  System.out.printf("Real number = " + num2 +" | Squareroot number = " + stepOne + " | Squareroot Number to the power of the Int = " + stepTwo);
		  
		
		  
		  //Write down the results produced by your program when the real number 7.8985 and
		  //the integer 3 are input.
		  
		 //All the steps from the previous code above are printed, eg: the square root 
		  
		  
		  //Change your program so that instead of inputting an integer power, a real number
		  //power can be input.
		  //Write down the results produced by your program when the following are input:
		  //a) the number 16 and the real number power 0.5
		  //b) the number 8 and the real number power 0.33
		  
		  //a) Real number = 16.0 | Squareroot number = 4.0 | Squareroot to the power of 2 = 2.0
		  
		  //b) Real number = 8.0  | Squareroot number = 2.8284 | Squareroot to the power of 2 = 1.6817
		  
		  
		  //Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		  
		  
		  //Yes, it changes the further decimal places slightly, but keep the first decimal place the same
		  
		 }




	}


