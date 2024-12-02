package unit1;

import java.util.Scanner;

/**
* Description:  Casting Assignment 1
* Date: Oct 15, 2024
* @author Ethan Henderson
*/
public class Casting {
 
 /**
  * This is the entry point to the program.
  * @param args unused
  */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why?
    System.out.println(doubleNum);
    
    //It is printing a double, such as 10.5 for example

    //can you explain what is happening in this code?
    doubleNum = doubleNum + 2.2;

    //Two doubles are being added 
    
    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);

    //An integer is being printed, 10 for example
    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      double to int
      int to long
      long to int

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data & the type of data)
    */
    
    
    int myInt = 10;
    double myDouble = 0; 
    myInt = (int) myDouble; 
   
    
    double myDouble2 = 10.0; 
    int myInt2 = 11;
    
    int myInt3 = 12;
    long myLong = 0; 
    
    long myLong2 = 0; 
    int myInt4 = 14; 

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    
    //code
    double myNum = 10.5;
    System.out.println(Math.round(myNum));
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    //code
    double num = in.nextDouble(); 
    short  theShort = 0; 
    
  }
}