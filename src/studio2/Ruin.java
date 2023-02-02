package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double startAmount, winLimit; 
		double currentDay = 0;
		double totalSimulations; 
		double winChance;

		System.out.println ("winLimit:");
		winLimit = in.nextDouble();
		System.out.println ("winChance:");
		winChance = in.nextDouble();
		System.out.println ("startAmount:");
		startAmount = in.nextDouble();
		System.out.println ("totalSimulations:");
		totalSimulations = in.nextDouble ();

		double currentAmount = startAmount;



		while (totalSimulations > currentDay) {

			while (currentAmount >= 1 && currentAmount < winLimit)

				if (Math.random() < winChance)

				{ 	
					currentAmount++; 
				System.out.println ("win");
				}

				else 
				{
					currentAmount--;
				System.out.println ("loss");
				}

if (currentAmount == winLimit)
{
	currentDay++;
System.out.println ("Success");
System.out.println ("Current Day:" +currentDay);
currentAmount = startAmount;
}

if (currentAmount == 0)
{
	currentDay++; 
System.out.println ("Ruin");
System.out.println ("Current Day:" +currentDay);
currentAmount = startAmount;


}
		}	

	}






}


