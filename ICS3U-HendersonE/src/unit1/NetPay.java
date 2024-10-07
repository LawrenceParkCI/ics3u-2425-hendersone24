package unit1;
 /**
  * Description: Worksheet with variables
  */

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hours= 40;
		double wage = 5.00; 
		double insurance = 2.00;
		double tax = 0.22;
		var netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
        System.out.println("the net pay of this employee is $" + netPay);
	}

}
