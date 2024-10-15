package unit1;

/**
* Description: Casting 2
* Date: Oc 15, 2024
* @author Ethan Henderson
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    
    //answer
    //It is showing that char1 is an ASCII value, the it add the num 1 onto the ASCII value, combined they form char2. 

    //Why do you think this happens?
    
    //answer 
    //Once the character is transformed to an ASCII, the number 1 is added on using the + sign with no brackets in between. 
    
    //Investigate what is ASCII. What is it?
    
    //answer
    //ASCII is a character encoding format, where it can assign a num in a char's place.
    
    //Can you find the number value for 'a'? Does it match with your findings above?
    
    //answer
    //ASCII number for "a" is 97, so 97 + b/1 is 98
    
    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
    
    String myCharCap = "a"; 
    System.out.println(myCharCap.toUpperCase());
    

    

  }
}