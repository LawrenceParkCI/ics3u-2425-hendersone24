package unit1;
/**
 * Date: Oct 1, 2024
 * Description: Math Operators 
 * @author Ethan Henderson
*/
public class MathOperators {
/**
 *
 * @param
 */
   public static void main (String [] args) {
      /*
         Pre: Kind of Math, but not really
         What do you notice is happening?
         //It prints out ints and strings but combines them with a + sign
      */
      
      //      System.out.println("Butter" + "fly");
      
      //      System.out.println("1 + 2 + 3 + 4 + 5");
      
      //      System.out.println(1 + 2 + 3 + 4 + 5);
      
      //      System.out.println(1 + 2 + "3 + 4 + 5");
      
      //      System.out.println("1 + 2 + 3" + 4 + 5);
      
      
      //Why do you think the last two outputs act so differently?
      //It combines ints and strings into a line
      
      //Summary: What are two possible roles of the + operator?
     //To add numbers and variable value with a string
      
      /*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
      */
         
      // + means: 
	   System.out.println(9+1 + "it adds numbers together");
      
      // - means: 
	   System.out.println(9-1 + "it subtracts numbers together");
      
      // * means:
	   System.out.println(9 * 2 + "it multiplies numbers together");
      
      // / means: 
	   System.out.println(9/1 + "it divides numbers together");
      
      
      
      //Print the following expression: (3 + 2) * 5
      //Print the following expression: 3 + 2 * 5
	   System.out.println((3+2)*5);
	   System.out.println(3+2*5);
      
      //Was this expected? Why or why not?
      /*
         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
         
        
         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
      */     System.out.println((45 * 9/5) + 3);
      		 System.out.println((900 - 32) + 5/9);
      
      /*    
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
         
      */ System.out.println(" % finds out the remainder of division");
      
      //I think % means: The Remainder
      
   }
}