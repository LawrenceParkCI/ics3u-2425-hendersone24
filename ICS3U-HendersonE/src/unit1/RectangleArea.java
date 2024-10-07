package unit1;
/**
 * Date: Oct 7, 2024
 * Description: A rectangles area and volume.
 * @author Ethan Henderson
 */
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length, width, depth; 
		
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the length of the rectangle and <Enter>: ");
		length = sc.nextInt();
		
		System.out.println("Type in the width of the rectangle and <Enter>: ");
		width = sc.nextInt();
		
		System.out.println("Type in the depth of the rectangle and <Enter>: ");
		depth = sc.nextInt();
		
		//calculate the volume
		int volume = length * width * depth; 
		
		//print the output
		System.out.println("The volume of your rectangle is " + volume);
		sc.close();

	}

}
