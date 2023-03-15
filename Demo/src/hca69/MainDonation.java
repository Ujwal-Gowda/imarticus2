package hca69;

import java.util.Scanner;

public class MainDonation 
{
	public static void main(String [] args)
	{
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter the age");
		Scanner s2=new Scanner (System.in);
		System.out.println("Enter the weight");

		try
		{
			int age=s1.nextInt(age);
			
			double weight=s2.nextDouble();
			Donating d2=new Donating(age, weight);
			
		try
		{

			d2.checkeligibility();
		}
		
		catch(NotEligibleForDonating)
		{
			System.out.println("You are not eligible for blood donating");
			
		}
	}
	catch(InputMismatchException e)
	{
		System.out.println("Invalid number");
	}
	
  }

}
