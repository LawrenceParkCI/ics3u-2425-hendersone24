package unit1;
/**
 * Oct 7, 2024
 * Description: InputChars
 * @author Ethan Henderson
 */
import java.util.Scanner;

public class InputChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner(System.in);
	
	//declare variables
	char ch1, ch2, ch3; 
	
	System.out.println("Type nay 3 characters on the keyboard");
	System.out.println("Press <Enter> after each.");
	ch1 = sc.nextLine().charAt (0); 
	ch2 = sc.nextLine().charAt(0);
	ch3 = sc.nextLine().charAt(0);
	System.out.println();
	System.out.print("Together these 3 letters spell: " + (ch1 + ch2 + ch3));
	}
	

}
