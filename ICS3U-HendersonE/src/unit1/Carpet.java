package unit1;

import java.util.Scanner;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type width in metres");
		int width = sc.nextInt();
		System.out.println("Type length in metres");
		int length = sc.nextInt();
		System.out.println("Type in price per square metre");
		int price = sc.nextInt(); 
		

		
		Object carpetCost = (width * length * price);
	}

}
