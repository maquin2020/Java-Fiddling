//==============================================================
//Computations.java			Author: Michael Quinlan
//					Course: CSCI 1301
//Lab assignment to demonstrate understanding of integer types.
//==============================================================

public class Computations 
{

	public static void main(String[] args) 
	{
		//Define integer values.
		
		int number1 = 15, number2 = 22, number3 = 30;
		double average = (number1 + number2 + number3)/ 3d;
		
		final int MULTIPLYER = 3;
		
		//Section 1
		// Use integer values to "plug in" variables to achieve desire output.
		// Condense print sequence into one large code set.
				
		System.out.println("The numbers are " +  number1 + ", " + number2 + ", and " + number3 + ".");
		
		System.out.println("The average of these numbers is " + average + ".");
		
		System.out.println("The quotient of the third number, " + number3 + " divided by the second number, "
				+ "" + number2 +" is " + number3 / number2 + ".");
		
		System.out.println("The remainder of the third number, " + number3 + " divided by the second number, "
				+ "" + number2 + " is " + number3 % number2 + ".");
		
		System.out.println("The product of the three numbers is " + number1 * number2 * number3 + ".");
		
		//Insert line break.
		
		System.out.println("\n******************\n");
		
		//Section 2
		
		//Create new integer set based on previous set.
		
		int number1m = number1 * MULTIPLYER, number2m = number2 * MULTIPLYER, number3m = number3 * MULTIPLYER;
		float averagem = (number1m + number2m + number3m) / 3f;
		System.out.println("Here are the numbers multiplied by the MULTIPLIER, " + MULTIPLYER + ".");
		System.out.println("The numbers are " + number1m + ", " + number2m + ", " + number3m + ".");
		System.out.println("The average of these numbers is " + averagem + ".");
		System.out.println("The quotient of the third number, " + number3m + ", divided by the second number, " + number2m + " is "
				+ "" + number3m / number2m + ".");
		System.out.println("The remainder of the third number, " + number3m + " divided by the second number, "
				+ "" + number2m + " is " + number3m % number2m + ".");
		System.out.println("The product of the three numbers is " + number1m * number2m * number3m + ".");
		
		//End sequence.
		
		System.out.println("\n******************\n");
		System.out.println("HAVE A NICE DAY!!!!!");
		
	}
}
