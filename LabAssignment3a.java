//======================================================
//LabAssigment3a.java			Author: Michael Quinlan
//								Course: CSCI1301
//Code to generate a user ID based on input.
//======================================================

	import java.util.Scanner;
	import java.util.Random;


public class LabAssignment3a
{

	public static void main(String[] args)
	{
		//Setup scanner, string, and random assignments.

		String name1, name2;
		Scanner inputname1= new Scanner (System.in);
		Scanner inputname2= new Scanner (System.in);
		Random generator = new Random();
		int num1;

		//Go back later and find a simpler way to do that^^^^
		//Find process other than using two of everything :)

		System.out.println("Enter your first name:");
		name1= inputname1.nextLine();
		System.out.println("Enter your last name:");
		name2= inputname2.nextLine();

		//User inputs first and last name; scanner and random generator outputs custom ID
		num1= generator.nextInt(100);

		System.out.print("Your generated ID is : "+ name1.substring(0,1) +""
		+ name2.substring(0, 5) + "" + num1 +"");

		inputname1.close();
		inputname2.close();

		//Scanners closed, project completed

	}

}
