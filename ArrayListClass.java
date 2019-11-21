//-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-
//ArrayListClass.java			Author: Michael Quinlan
//								Course: CSCI1301
//Setting up arrays with chickens
//-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

import java.util.ArrayList;

public class ArrayListClass 
{

	public static void main(String[] args) 
	{
		ArrayList<String> chickens = new ArrayList<String>();
		
		chickens.add("Silky");
		chickens.add("Leghorn");
		chickens.add("Australorp");
		chickens.add("Polish");
		chickens.add("Dorking");
		
		System.out.println("Here are the chickens: " +chickens);
		System.out.println("Number of chickens: " +chickens.size());
		
		chickens.remove(2);
		chickens.add(2, "Welsummer");
		
		System.out.println("Here is the revised chicken list: " +chickens+ "\n");
		
		int index = 0;
		while (index < chickens.size())
		{
			System.out.println(chickens.get(index));
			index++;
		}		
		
	}

}
