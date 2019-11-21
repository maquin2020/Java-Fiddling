//===========================================================================
//LabAssignment3b.java			Author: Michael Quinlan
//								Course: CSCI1301
//
//Write a program that generates a set of random integers for
//radius (r) and height (h) for a cylinder in the range 1 to 20, inclusive,
//and then compute the volume of the cylinder, where: Volume= 𝜋𝑟2h.
//===========================================================================

	//Import Random and Math

	import java.util.Random;
	import java.lang.Math;


public class LabAssignment3b
{

	public static void main(String[] args)
	{
		// Set variables and random generators
		
		
		Random generator = new Random();
		int r;
		int h;

		r = generator.nextInt(20) + 1;
		h = generator.nextInt(20) + 1;

		//Output randomized values and plug into formula
		
		System.out.println("The radius of the cylander is: " + r);
		System.out.println("The height of the cylander is: " + h);

		System.out.println("The volume of the cylander is: " + (Math.PI * (r * r)* h));



	}

}
